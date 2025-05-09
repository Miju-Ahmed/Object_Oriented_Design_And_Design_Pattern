package OODDP.Exam.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName){
        System.out.println("Vlc Playing file name : "+fileName);
    }

    @Override
    public void playMp4(String fileName){
        //do not nothing
    }
}
