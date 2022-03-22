public class FacebookNotification extends NotifiactionDecorator{
    public FacebookNotification(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(){
        notifier.send();
        System.out.println("Facebook Notification sent.");
    }
}
