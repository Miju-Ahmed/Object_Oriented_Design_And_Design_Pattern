package OODDP.Exam.Decorator.Tutorials;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Rectangle decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border color : Red");
    }
}
