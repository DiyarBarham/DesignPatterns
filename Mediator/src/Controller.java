public class Controller {
    public static void main(String[] args){
        AuctionMediator med = new AuctionMediator();
        Buyer b1 = new AuctionBuyer(med, "Ahmad");
        Buyer b2 = new AuctionBuyer(med, "Mahmoud");
        Buyer b3 = new AuctionBuyer(med, "Mustafa");

        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(680);

        med.findHighestBidder();
    }
}
