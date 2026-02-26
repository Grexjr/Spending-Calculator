package io.github.grexjr.spendingcalculator.constants;

public class StringConstants {

    // Util strings
    public static final String NEWLINE = "%n";

    // Input invalid strings
    public static final String BLANK_STRING_INVALID = "Input cannot be blank!";

    public static final String TITLE_STRING = "SPENDING CALCULATOR";
    public static final String BYLINE = "By: Gavin March";
    public static final String TITLE_OPTION_FORMAT = "%-15s | %-15s | %-15s | %-15s ";
    public static final String[] TITLE_OPTIONS = new String[]{
            "1. Add Income",
            "2. Add Expense",
            "3. Print Totals",
            "4. Quit"
    };




    /**
     * Does not make sense to instantiate this class.
     */
    private StringConstants(){
        throw new AssertionError("Constant class - do not instantiate!");
    }

}
