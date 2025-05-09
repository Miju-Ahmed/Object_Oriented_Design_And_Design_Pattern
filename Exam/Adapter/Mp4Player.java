package OODDP.Exam.Adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        //do not nothing
    }

    @Override
    public void playMp4(String fileName){
        System.out.println("Mp4 playing file name : " + fileName);
    }
}
