package OODDP.Exam.Chain_Of_Responsibility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==info){
            System.out.println("Info : " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
