package OODDP.Exam.Builder.Builder1;

import java.util.List;

public class StudentBuilder {
    int rollNumber;
    int age;
    String name;
    String faName;
    String moName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }
    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }
    public StudentBuilder setFaName(String faName){
        this.faName = faName;
        return this;
    }
    public StudentBuilder setMoName(String moName){
        this.moName = moName;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
