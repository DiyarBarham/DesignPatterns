public class Draft implements Document{
    @Override
    public Document publish() {
        System.out.println("Document is in Draft and will be moderated.");
        return new Moderation();
    }
}
