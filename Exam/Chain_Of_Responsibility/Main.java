package OODDP.Exam.Chain_Of_Responsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.error, "Exception happend");
        logObject.log(LogProcessor.debug,  "Need to debug this");
        logObject.log(LogProcessor.info, "just for info");
    }
}
