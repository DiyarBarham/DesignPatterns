public class SofaFactory {
    static Furnature buildFurnature(FurnatureDesign design){
        Furnature furnature = null;
        switch(design){
            case ArtDeco:
                furnature = new ArtDecoFurnature(FurnatureType.Sofa);
                break;
            case Victorian:
                furnature = new VictorianFurnature(FurnatureType.Sofa);
                break;
            case Modern:
                furnature= new ModernFurnature(FurnatureType.Sofa);
                break;
            default:
                break;
        }
        return furnature;
    }
}
