public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void shapeAndColor() {
        System.out.print("Circle with color ");
        color.color();
    }
}
