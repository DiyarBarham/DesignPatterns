import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order :
                orderList) {
            order.cook();
        }
        orderList.clear();
    }
}
