package OODDP.Exam.Builder_Pattern;

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
