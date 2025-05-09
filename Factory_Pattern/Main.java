public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = Singleton.getShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
    }
}
