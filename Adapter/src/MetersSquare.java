public class MetersSquare implements Meters{
    int length;
    int width;
    int height;
    @Override
    public void area() {
        System.out.print(length*width);
    }

    @Override
    public void volume() {
        System.out.print(length*width*height);
    }
}
