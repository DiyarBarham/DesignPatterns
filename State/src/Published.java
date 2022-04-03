public class Published implements Document{
    @Override
    public Document publish() {
        System.out.println("Document is already published.");
        return this;
    }
}
