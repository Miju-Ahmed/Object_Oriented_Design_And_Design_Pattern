package OODDP.Exam.Builder;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public Phone(String os, int ram, String processor, double screensize, int battery){
        super();
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screensize = screensize;
        this.battery = battery;
    }
    
    public String toString(){
        return "Phone: "+os+" "+ram+" "+processor+" "+screensize+" "+battery;
    }
}