public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public void shapeAndColor() {
        System.out.print("Square with color ");
        color.color();
    }
}
