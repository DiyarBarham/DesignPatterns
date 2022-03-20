abstract class Plane implements Cloneable{
    protected int numberOfEngines;

    abstract void setNumberOfEngines();

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
