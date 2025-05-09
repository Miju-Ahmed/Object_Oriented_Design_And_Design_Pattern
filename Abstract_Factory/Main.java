package Object_Oriented_Design_And_Design_Pattern.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape s1 = shapeFactory.getShape("Rectangle");
        s1.draw();
    }
}
