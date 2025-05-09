package OODDP.Exam.Builder.Builder1;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentbuilder extends StudentBuilder{
    public StudentBuilder setSubjects(){
        List<String>subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("Computer Architecture");
        this.subjects = subs;
        return this;
    }
}
