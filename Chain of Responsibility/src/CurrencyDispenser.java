public abstract class CurrencyDispenser {
    private CurrencyDispenser nextDispenser;

    public CurrencyDispenser getNextDispenser() {
        return nextDispenser;
    }

    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public abstract void dispense(Currency currency);
}
