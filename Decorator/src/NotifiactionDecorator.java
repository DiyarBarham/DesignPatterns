public class NotifiactionDecorator implements Notifier {
    protected Notifier notifier;

    public NotifiactionDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
