package OODDP.Exam.Chain_Of_Responsibility;

public abstract class LogProcessor {
    public static int info=1;
    public static int debug = 2;
    public static int error = 3;

    LogProcessor nextLoggerProcessor;
    LogProcessor(LogProcessor loggerProcessor){
        this.nextLoggerProcessor = loggerProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
