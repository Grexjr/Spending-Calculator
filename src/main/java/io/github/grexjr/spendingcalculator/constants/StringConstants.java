package io.github.grexjr.spendingcalculator.constants;

public class StringConstants {

    // Util strings
    public static final String NEWLINE = "%n";
    public static final String ERROR = "ERROR";

    // Input invalid strings
    public static final String BLANK_STRING_INVALID = "Input cannot be blank!";
    // Input invalid ints
    public static final String INT_OUT_OF_BOUNDS = "Input must be between %d and %d!";
    public static final String INVALID_INT_INPUT = "Input must be an integer!";
    public static final String INVALID_DOUBLE_INPUT = "Input must be a decimal number!";
    public static final String INVALID_INCOME_INPUT = "Income must be of form (amount,Date[MM/DD/YYYY],description)";

    public static final String TITLE_STRING = "SPENDING CALCULATOR";
    public static final String BYLINE = "By: Gavin March";
    public static final String TITLE_OPTION_FORMAT = "%-15s | %-15s | %-15s | %-15s ";
    public static final String[] TITLE_OPTIONS = new String[]{
            "1. Add Income",
            "2. Add Expense",
            "3. Print Totals",
            "4. Instructions",
            "5. Quit"
    };




    /**
     * Does not make sense to instantiate this class.
     */
    private StringConstants(){
        throw new AssertionError("Constant class - do not instantiate!");
    }

}
