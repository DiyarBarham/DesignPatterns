public class TwoEnginesPlane extends Plane{

    public TwoEnginesPlane(){
        this.numberOfEngines = 2;
    }
    @Override
    void setNumberOfEngines() {
        System.out.println("2 Engines Plane added and its id is: "+ this);
    }

}
