public class LogisticFactory {
    public Logistics createLogisticMethod(String channel){
        if(channel == null)
            return null;
        switch (channel){
            case "road":
                return new RoadLogistics();
            case "sea":
                return new SeaLogistics();
            default:
                throw new IllegalArgumentException(channel + "is an unknown way of transportation.");
        }
    }
}
