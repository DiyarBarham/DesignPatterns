public class Moderation implements Document{
    @Override
    public Document publish() {
        System.out.println("Document is in moderated state and will be published.");
        return new Published();
    }
}
