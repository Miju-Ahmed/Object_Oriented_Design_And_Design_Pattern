package OODDP.Exam.Chain_Of_Responsibility;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==error){
            System.out.println("Error: " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
