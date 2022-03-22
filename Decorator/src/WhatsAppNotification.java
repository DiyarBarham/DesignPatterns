public class WhatsAppNotification extends NotifiactionDecorator{
    public WhatsAppNotification(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(){
        notifier.send();
        System.out.println("WhatsApp Notification sent.");
    }
}
