package OODDP.Exam.Mediator;

public class Mediator {
    public static void main(String[] args) {
        User miju = new User("Miju");
        User murad = new User("Murad");

        miju.sendMessage("Hi. Im Miju");
        murad.sendMessage("Hello. Im Murad");
    }
}
