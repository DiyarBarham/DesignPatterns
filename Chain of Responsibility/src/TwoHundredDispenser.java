public class TwoHundredDispenser extends CurrencyDispenser{

    public TwoHundredDispenser() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null){
            int total = currency.getTotal();
            int remainder = total;
            if(total>=200){
                int count = total/200;
                remainder = total %200;
                System.out.println("Dispensing "+count+" note of 200 nis notes.");
            } if(remainder > 0 && this.getNextDispenser() != null){
                this.getNextDispenser().dispense(new Currency(remainder));
            }
        }
    }
}
