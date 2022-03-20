public class FourEnginesPlane extends Plane{

    public FourEnginesPlane(){
        this.numberOfEngines = 4;
    }
    @Override
    void setNumberOfEngines() {
        System.out.println("4 Engines Plane added and its id is: "+ this);
    }

}
