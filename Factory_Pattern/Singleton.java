public class Singleton {
    private static ShapeFactory shapeFactory = new ShapeFactory();

    private Singleton(){}

    public static ShapeFactory getShapeFactory(){
        return shapeFactory;
    }
}
