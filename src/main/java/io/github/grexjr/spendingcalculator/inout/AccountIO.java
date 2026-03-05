package io.github.grexjr.spendingcalculator.inout;

import io.github.grexjr.spendingcalculator.model.Account;
import io.github.grexjr.spendingcalculator.model.AccountingItem;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AccountIO {

    private final Path storage = Paths.get("data","accounts");

    public AccountIO(){}

    public void initializeStorage(){
        Path accountsPath = storage;
        Path logsPath = Paths.get("data", "logs");

        try{
            // Create both directory paths
            Files.createDirectories(accountsPath);
            Files.createDirectories(logsPath);

            // Write to log that creation has occurred
        } catch (IOException e){
            // print to system err
            System.err.println("CRITICAL: Could not create required storage!" + e.getMessage());
        }
    }

    public void save(Account account){
        // Creates file named "Account.csv" |TODO will later be user input
        Path filePath = storage.resolve("Account.csv");

        StringBuilder csvContent = new StringBuilder();

        csvContent.append("Date,Description,Amount\n");

        for(AccountingItem item : account.getItems()){
            String sanitizedDescription = item.getDescription().replace(",",""); //Remove commas
            String line = String.format("%s,%s,%.2f%n",
                    item.getDate(),
                    sanitizedDescription,
                    item.getAmount());
            csvContent.append(line);
        }

        try{
            Files.writeString(filePath, csvContent.toString(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public Account loadAccount(){
        Path filePath = storage.resolve("Account.csv");
        if(Files.notExists(filePath)){
            // Print Load empty file
            return new Account();
        }

        try{
            // Read lines from CSV
            List<String> lines = Files.readAllLines(filePath);
            Account account = new Account();
            for(int i = 1; i < lines.size(); i++){
                String line = lines.get(i);

                if(line.trim().isEmpty()) continue;

                String[] parts = line.split(",");

                DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-d-M");

                LocalDate date = LocalDate.parse(parts[0],format);
                String description = parts[1];
                double amount = Double.parseDouble(parts[2]);

                AccountingItem item;

                if(amount >= 0){
                    item = new AccountingItem(amount, date, description,false);
                } else {
                    item = new AccountingItem(amount,date,description,true);
                }
                account.getItems().add(item);
                account.updateAccount();
            }
            return account;
        } catch(IOException | NumberFormatException e){
            System.out.println("FAILURE TO READ FILE.ACCOUNTIO.95");
            return null;
        }
    }


}
