public abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);

}
