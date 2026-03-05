package io.github.grexjr.spendingcalculator.constants;

public class StringConstants {

    // Util strings
    public static final String NEWLINE = "%n";
    public static final String ERROR = "ERROR";
    public static final String BACK_STRING = "BACK";
    public static final String INPUT = "INPUT =>    ";

    // Input invalid strings
    public static final String BLANK_STRING_INVALID = "Input cannot be blank!";
    // Input invalid ints
    public static final String INT_OUT_OF_BOUNDS = "Input must be between %d and %d!";
    public static final String INVALID_INT_INPUT = "Input must be an integer!";
    public static final String INVALID_DOUBLE_INPUT = "Input must be a decimal number!";
    public static final String INVALID_INCOME_INPUT = "Income must be of form (amount,Date[MM/DD/YYYY],description)";

    public static final String TITLE_STRING = "=========SPENDING CALCULATOR=========";
    public static final String BYLINE = "By: Gavin March";
    public static final String TITLE_OPTION_FORMAT = " %-15s ";
    public static final String[] TITLE_OPTIONS = new String[]{
            "1. Add Item",
            "2. Print Summary",
            "3. Instructions",
            "4. Save Account",
            "5. Quit"
    };

    public static final String ASK_FOR_ACCT_ITEM = ">   Please enter account item in csv format in the template:%n" +
            ">> amount, date of transaction, description of transaction%n" +
            ">> Type back to go back";
    public static final String EXPENSE = "expense";
    public static final String INCOME_ADDED = "Income Added!";

    public static final String ACCOUNT_TITLE = "====ACCOUNT====";
    public static final String ACCOUNTING_ITEM = "%-10s | %-10s | %,(-10.2f";
    public static final String ACCOUNT_TOTALS = "====ACCOUNT TOTALS====";
    public static final String ACCOUNT_TOTAL_ITEMS = "Total Income: %,.2f" +
            "%nTotal Expenses: %,(.2f" +
            "%nAverage Income: %,.2f" +
            "%nAverage Expense: %,(.2f%n";

    public static final String SUMMARY_TITLE = "====ACCOUNT SUMMARY====";


    public static final String INSTRUCTIONS_HEADER = "====INSTRUCTIONS====";
    public static final String INSTRUCTIONS =
            "> This is a spending calculator!%n> Use this to track finances. Type a number to enter a specific task, " +
                    "i.e. 1 for entering an item to your account.%n> This will save your values to a file, " +
                    "so you can access them.%n" +
                    "> Items are in csv format of: [amount (two decimals), date (M/D/YY or MM/DD/YYYY), description]%n" +
                    "> Type -back- or -BACK- in any menu to return to the main menu.%n";

    public static final String SAVING_STRING = "Saving account...";
    public static final String ACCOUNT_SAVED = "Account saved!";
    public static final String LOADING_ACCOUNT = "Loading account...";
    public static final String ACCOUNT_LOADED = "Account loaded!";




    /**
     * Does not make sense to instantiate this class.
     */
    private StringConstants(){
        throw new AssertionError("Constant class - do not instantiate!");
    }

}
