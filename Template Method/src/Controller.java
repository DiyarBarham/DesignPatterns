public class Controller {
    public static void main(String[] args){
        House bigHouse = new BigHouse();
        House garageHouse = new GarageHouse();

        bigHouse.DoorType();
        bigHouse.RoofType();
        bigHouse.WallType();
        bigHouse.WindowType();

        garageHouse.WindowType();
        garageHouse.WallType();
        garageHouse.RoofType();
        garageHouse.DoorType();
    }
}
