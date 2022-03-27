public class WithdrawFromATM {
    private static CurrencyDispenser TwoHunderedDispenser = new TwoHundredDispenser();
    private static CurrencyDispenser OneHunderedDispenser = new OneHundredDispenser();
    private static CurrencyDispenser FiftyDispenser = new FiftyDispenser();
    private static CurrencyDispenser TwentyDispenser = new TwentyDispenser();
    private static CurrencyDispenser dispenser;
    static {
        TwoHunderedDispenser.setNextDispenser(OneHunderedDispenser);
        OneHunderedDispenser.setNextDispenser(FiftyDispenser);
        FiftyDispenser.setNextDispenser(TwentyDispenser);
        dispenser = TwoHunderedDispenser;
    }

    public static void withdraw(Currency currency){
        if(currency != null) dispenser.dispense(currency);
    }

}
