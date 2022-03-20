public class FurnatureFactory {
    private FurnatureFactory(){

    }

    public static Furnature buildFuranture(FurnatureDesign design, FurnatureType type){
        Furnature furnature = null;
        switch (type){
            case Chair:
                furnature = ChairFactory.buildFurnature(design);
                break;
            case Sofa:
                furnature = SofaFactory.buildFurnature(design);
                break;
            case CoffeeTable:
                furnature = CoffeeTableFactory.buildFurnature(design);
                break;
        }
        return furnature;
    }
}
