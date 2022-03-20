public class ArtDecoFurnature extends Furnature{
    ArtDecoFurnature(FurnatureType type){
        super(FurnatureDesign.ArtDeco, type);
        construct();
    }
    @Override
    void construct() {
        System.out.println("Making Art Deco Furnature.");
    }
}
