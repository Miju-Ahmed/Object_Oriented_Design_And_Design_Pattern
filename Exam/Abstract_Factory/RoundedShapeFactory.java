package OODDP.Exam.Abstract_Factory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTNGLE")){
            return new RoundRectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundSquare();
        }
        return null;
    }
}
