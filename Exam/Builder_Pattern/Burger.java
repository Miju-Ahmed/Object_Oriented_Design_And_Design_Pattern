package OODDP.Exam.Builder_Pattern;

public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
