public class Controller {
    public static void main(String[] args){
        Converter c = new Converter();
        VideoFormat MP4Video = new MP4();
        VideoFormat MPEG4Video = new MPEG4();

        System.out.println("MP4 File is: " + MP4Video);
        System.out.println("MP4EG File is: " + MPEG4Video+"\n\n\n");

        System.out.println("Convert MP4 File:");
        c.WebmConverter(MP4Video);
        System.out.println("Convert MP4EG File:");
        c.MP4Converter(MPEG4Video);
    }
}
