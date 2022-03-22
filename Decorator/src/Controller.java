public class Controller {
    public static void main(String[] args){
        Notifier notifiaction1 = new Notification();
        Notifier faceBookNotification = new FacebookNotification(notifiaction1);
        Notifier SMSNotification = new SMSNotification(faceBookNotification);

        System.out.println("Normal notification:");
        notifiaction1.send();
        System.out.println("\n\n Facebook notification:");
        faceBookNotification.send();
        System.out.println("\n\n SMS and Facebook notification:");
        SMSNotification.send();
    }
}
