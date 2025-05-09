package Object_Oriented_Design_And_Design_Pattern.Adapter_Pattern;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName){
        // System.out.println("Play vlc");
    }
    @Override
    public void playMp4(String fileName){
        System.out.println("mp4 plaayr");
    }
}
