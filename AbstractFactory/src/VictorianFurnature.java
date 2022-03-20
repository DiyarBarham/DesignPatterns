public class VictorianFurnature extends Furnature{
    VictorianFurnature(FurnatureType type){
        super(FurnatureDesign.Victorian, type);
        construct();
    }
    @Override
    void construct() {
        System.out.println("Making Victorian Furnature.");
    }
}
