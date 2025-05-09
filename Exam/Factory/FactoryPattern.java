package OODDP.Exam.Factory;

import java.util.Scanner;

public class FactoryPattern {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ShapeFactory object = SingletonPattern.getShapeFactory();

        while (true) {
            String shape = scanner.nextLine();
            Shape s = object.getShape(shape);
            s.draw();
        }
        
    }
}
