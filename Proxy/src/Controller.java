public class Controller {
    public static void main(String[] args){
        ProxyInternet internet = new ProxyInternet();
        internet.addBannedSite("a.com");
        internet.addBannedSite("b.com");
        internet.connect("a.com");
        internet.connect("c.com");
    }
}
