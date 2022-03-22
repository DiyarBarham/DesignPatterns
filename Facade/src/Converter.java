public class Converter {
    public void MP4Converter(VideoFormat v){
        MP4 mp4 = new MP4();
        mp4.format(v);
    }

    public void MPEG4Converter(VideoFormat v){
        MPEG4 mpeg4 = new MPEG4();
        mpeg4.format(v);
    }

    public void WebmConverter(VideoFormat v){
        Webm webm = new Webm();
        webm.format(v);
    }
}
