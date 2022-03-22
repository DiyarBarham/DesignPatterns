public class SMSNotification extends NotifiactionDecorator{
    public SMSNotification(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(){
        notifier.send();
        System.out.println("SMS Notification sent.");
    }
}
