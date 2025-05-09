package OODDP.Exam.Decorator.Tutorials;

public class Decorator {
    public static void main(String[] args) {
        Shape circle = new Circle();
        // Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("circle with red border");
        redRectangle.draw();
    }
}
