public class Controller {
    public static void main(String[] args){
        Cook kitchen = new Cook();

        CookMeat meat = new CookMeat(kitchen);
        CookChicken chicken = new CookChicken(kitchen);

        Waiter waiter = new Waiter();
        waiter.takeOrder(meat);
        waiter.takeOrder(chicken);

        waiter.placeOrders();
    }
}
