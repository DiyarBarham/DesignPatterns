public class CoffeeTableFactory {
    static Furnature buildFurnature(FurnatureDesign design){
        Furnature furnature = null;
        switch(design){
            case ArtDeco:
                furnature = new ArtDecoFurnature(FurnatureType.CoffeeTable);
                break;
            case Victorian:
                furnature = new VictorianFurnature(FurnatureType.CoffeeTable);
                break;
            case Modern:
                furnature= new ModernFurnature(FurnatureType.CoffeeTable);
                break;
            default:
                break;
        }
        return furnature;
    }
}
