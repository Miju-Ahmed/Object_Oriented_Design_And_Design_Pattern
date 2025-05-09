package Object_Oriented_Design_And_Design_Pattern.Abstract_Factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
