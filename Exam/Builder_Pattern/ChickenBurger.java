package OODDP.Exam.Builder_Pattern;

public class ChickenBurger extends Burger {
    @Override
    public float price(){
        return 50.0f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }
}
