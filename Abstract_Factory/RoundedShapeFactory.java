package Object_Oriented_Design_And_Design_Pattern.Abstract_Factory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }
        return null;
    }
}
