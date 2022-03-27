public class TwentyDispenser extends CurrencyDispenser{

    public TwentyDispenser() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null){
            int total = currency.getTotal();
            int remainder = total;
            if(total>=20){
                int count = total/20;
                remainder = total %20;
                System.out.println("Dispensing "+count+" note of 20 nis notes.");
            } if(remainder > 0 && this.getNextDispenser() != null){
                this.getNextDispenser().dispense(new Currency(remainder));
            }
        }
    }
}
