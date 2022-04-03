public class Controller {
    public static void main(String[] args){
        Trasportation transport = new Trasportation(new Bicycle());
        transport.transport();

        transport.setTransport(new Car());
        transport.transport();
    }
}
