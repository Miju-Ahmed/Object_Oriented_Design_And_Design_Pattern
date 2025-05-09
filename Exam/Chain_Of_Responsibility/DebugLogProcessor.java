package OODDP.Exam.Chain_Of_Responsibility;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel==debug){
            System.out.println("Debug : " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
