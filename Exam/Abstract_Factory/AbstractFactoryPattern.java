package OODDP.Exam.Abstract_Factory;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
        // shapeFactory = FactoryProducer.getFactory(false);
        shape = shapeFactory.getShape("SQUARE");
        shape.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape1 = shapeFactory1.getShape("RECTANGLE");
        shape1.draw();

        // shapeFactory = FactoryProducer.getFactory(true);
        // shape = shapeFactory.getShape("SQUARE");
        // shape.draw();

        

    }
}
