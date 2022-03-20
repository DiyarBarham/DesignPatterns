public class ChairFactory {
    static Furnature buildFurnature(FurnatureDesign design){
        Furnature furnature = null;
        switch(design){
            case ArtDeco:
                furnature = new ArtDecoFurnature(FurnatureType.Chair);
                break;
            case Victorian:
                furnature = new VictorianFurnature(FurnatureType.Chair);
                break;
            case Modern:
                furnature= new ModernFurnature(FurnatureType.Chair);
                break;
            default:
                break;
        }
        return furnature;
    }
}
