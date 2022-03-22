import java.util.ArrayList;
import java.util.List;

public class Box implements Object{
    List<Object> items = new ArrayList<Object>();
    int total=0;
    @Override
    public int price() {
        for (Object item :
                items) {
            total += item.price();
        }
        return total;
    }

    public void addItem(Object item){
        items.add(item);
    }

}
