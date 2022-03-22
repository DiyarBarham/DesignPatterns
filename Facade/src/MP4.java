public class MP4 implements VideoFormat{

    @Override
    public void format(VideoFormat v) {
        System.out.println(v+" File in MP4 Format.");
    }
}
