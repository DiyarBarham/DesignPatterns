public class OneHundredDispenser extends CurrencyDispenser{

    public OneHundredDispenser() {
        super();
    }

    @Override
    public void dispense(Currency currency) {
        if (currency != null){
            int total = currency.getTotal();
            int remainder = total;
            if(total>=100){
                int count = total/100;
                remainder = total %100;
                System.out.println("Dispensing "+count+" note of 100 nis notes.");
            } if(remainder > 0 && this.getNextDispenser() != null){
                this.getNextDispenser().dispense(new Currency(remainder));
            }
        }
    }
}
