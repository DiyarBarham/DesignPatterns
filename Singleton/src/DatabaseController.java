import java.util.List;
import java.util.ArrayList;
public class DatabaseController {
    private static DatabaseController manager = null;

    DatabaseController() {

    }

    public static synchronized DatabaseController getManager(){
        if(manager == null)
            manager = new DatabaseController();
        return manager;
    }

}
