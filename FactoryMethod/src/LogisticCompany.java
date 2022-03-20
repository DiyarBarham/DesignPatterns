public class LogisticCompany {
    public static void main(String[] args){
        LogisticFactory factory = new LogisticFactory();
        Logistics logisticRequest = factory.createLogisticMethod("road");
        logisticRequest.transport();
    }
}
