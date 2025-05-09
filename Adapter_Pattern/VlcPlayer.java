package Object_Oriented_Design_And_Design_Pattern.Adapter_Pattern;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("Play vlc");
    }
    @Override
    public void playMp4(String fileName){
        //
    }
    
}
