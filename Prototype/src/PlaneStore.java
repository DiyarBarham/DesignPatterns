import java.util.HashMap;
import java.util.Map;

public class PlaneStore {
    private static Map<Integer, Plane> planeMap = new HashMap<Integer, Plane>();

    static {
        planeMap.put(2, new TwoEnginesPlane());
        planeMap.put(4, new FourEnginesPlane());
    }
    public static Plane getPlane(Integer numberOfEngines){
        return (Plane) planeMap.get(numberOfEngines).clone();
    }
}
