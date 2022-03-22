public class ConnectedInternet implements Internet{

    @Override
    public void connect(String site) {
        System.out.println("Access to: "+site);
    }
}
