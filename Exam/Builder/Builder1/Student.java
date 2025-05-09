package OODDP.Exam.Builder.Builder1;

import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String faName;
    String moName;
    List<String> subjects;
    
    public Student(StudentBuilder builder){
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.faName = faName;
        this.moName = moName;
        this.subjects = subjects;
    }

    public String toString(){
        return " "+" roll number: "+rollNumber+" age : "+age+" name: "+name+" fatherName: "+faName+" MotherName : "+moName+" subjects: "+subjects.get(0)+", "+subjects.get(1)+","+subjects.get(2);

    }
}
