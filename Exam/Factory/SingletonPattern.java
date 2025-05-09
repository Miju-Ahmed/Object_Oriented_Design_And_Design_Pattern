package OODDP.Exam.Factory;

public class SingletonPattern {
    private static ShapeFactory shapeFactory = new ShapeFactory();
    private SingletonPattern(){}

    public static ShapeFactory getShapeFactory(){
        return shapeFactory;
    }

}
