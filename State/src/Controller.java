public class Controller {
    public static void main(String[] args){
        DocumentStateContext stateContext = new DocumentStateContext();

        stateContext.publish();
        stateContext.publish();
        stateContext.publish();
        stateContext.publish();
    }
}
