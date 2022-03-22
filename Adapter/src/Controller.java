public class Controller {
    public static void main(String[] args){
        MetersSquare ms = new MetersSquare();
        ms.length = 5;
        ms.width = 5;
        ms.height = 10;

        ImperialSquare is = new ImperialSquare();
        is.length = 2;
        is.width = 2;

        MetersAdapter ma = new MetersAdapter();
        ma.square = ms;

        ms.area();
        System.out.println(" meters^2");
        ms.volume();
        System.out.println(" meters^3");
        is.area();
        System.out.println(" foot^2");
        ma.area();
        System.out.println(" foot^2");
    }
}
