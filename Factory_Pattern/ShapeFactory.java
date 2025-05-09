public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType==null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangtle();
        }
        return null;
    }
}
