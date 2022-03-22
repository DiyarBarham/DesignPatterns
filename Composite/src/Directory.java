import java.util.ArrayList;
import java.util.List;

public class Directory implements Object{
    private List<Object> allItems = new ArrayList<Object>();
    private int total=0;
    @Override
    public int price() {
        for (Object item :
                allItems) {
            total += item.price();
        }
        return total;
    }
    public void addItem(Object item){
        allItems.add(item);
    }
}
