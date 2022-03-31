public class Controller {
    public static void main(String[] args){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("Changing state to 15:");
        subject.setState(15);
        System.out.println("\n\nChanging state to 11:");
        subject.setState(11);
    }
}
