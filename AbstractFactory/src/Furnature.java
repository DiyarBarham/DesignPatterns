abstract class Furnature {
    private FurnatureDesign design;
    private FurnatureType type;
    Furnature(FurnatureDesign design, FurnatureType type){
        this.design = design;
        this.type = type;
    }
    abstract void construct();

    public FurnatureDesign getDesign() {
        return design;
    }

    public void setDesign(FurnatureDesign design) {
        this.design = design;
    }

    public FurnatureType getType() {
        return type;
    }

    public void setType(FurnatureType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Furnature{" +
                "design=" + design +
                ", type=" + type +
                '}';
    }

}
