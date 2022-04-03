public class DocumentStateContext {
    private Document current;

    public DocumentStateContext() {
        current = new Draft();
    }

    public void publish(){
        current = current.publish();
    }
}
