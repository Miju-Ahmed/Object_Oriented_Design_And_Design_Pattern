package OODDP.Exam.Builder.Meal_Builder;

public class ChickerBurger extends Burger {
    @Override
    public float price(){
        return 50.0f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }
}
