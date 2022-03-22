public class Controller {
    public static void main(String[] args){
        Shape squareRed = new Square(new Red());
        Shape squareBlue = new Square(new Blue());
        Shape circleRed = new Circle(new Red());
        Shape circleBlue = new Circle(new Blue());

        squareBlue.shapeAndColor();
        squareRed.shapeAndColor();
        circleBlue.shapeAndColor();
        circleRed.shapeAndColor();
    }
}
