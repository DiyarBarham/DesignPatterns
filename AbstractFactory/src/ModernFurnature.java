public class ModernFurnature extends Furnature{
    ModernFurnature(FurnatureType type){
        super(FurnatureDesign.Modern, type);
        construct();
    }
    @Override
    void construct() {
        System.out.println("Making Modern Furnature.");
    }
}
