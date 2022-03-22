public class Controller {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();
        Box box5 = new Box();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        Item item5 = new Item();
        Item item6 = new Item();
        Item item7 = new Item();

        box1.addItem(item1);
        box1.addItem(box2);
        box2.addItem(item2);
        box2.addItem(item3);
        box2.addItem(box5);
        box3.addItem(item4);
        box5.addItem(item5);
        box5.addItem(item6);

        Directory dir = new Directory();
        dir.addItem(box1);
        dir.addItem(box3);
        dir.addItem(box4);
        dir.addItem(item7);
        System.out.println("total price: "+ dir.price());

    }
}
