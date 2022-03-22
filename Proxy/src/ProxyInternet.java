import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProxyInternet implements Internet{
    private static Internet internet = new ConnectedInternet();
    private static List<String> banned = new ArrayList<String>();

    @Override
    public void connect(String site) {
        if(banned.contains(site)){
            System.out.println("Access denied to: "+site);
        } else{
            internet.connect(site);
        }
    }
    public void addBannedSite(String site){
        banned.add(site);
    }
}
