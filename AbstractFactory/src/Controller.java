public class Controller {
    public static void main (String[] args){
        System.out.println(FurnatureFactory.buildFuranture(FurnatureDesign.ArtDeco, FurnatureType.Chair));
        System.out.println(FurnatureFactory.buildFuranture(FurnatureDesign.Victorian, FurnatureType.Sofa));
    }
}
