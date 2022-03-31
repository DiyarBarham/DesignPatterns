import java.util.ArrayList;

public class AuctionMediator implements Mediator{

    private ArrayList<Buyer> buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int max = 0;
        Buyer winner = null;
        for (Buyer b :
                buyers) {
            if (b.price > max) {
                max = b.price;
                winner = b;
            }
        }
        System.out.println("By paying " + max + " the action was won by " + winner.name+".");
    }
}
