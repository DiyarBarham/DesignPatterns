public class FiftyDispenser extends CurrencyDispenser{

    public FiftyDispenser() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null){
            int total = currency.getTotal();
            int remainder = total;
            if(total>=50){
                int count = total/50;
                remainder = total %50;
                System.out.println("Dispensing "+count+" note of 50 nis notes.");
            } if(remainder > 0 && this.getNextDispenser() != null){
                this.getNextDispenser().dispense(new Currency(remainder));
            }
        }
    }
}
