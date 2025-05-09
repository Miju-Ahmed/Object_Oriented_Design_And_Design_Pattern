package OODDP.Exam.Builder.Meal_Builder;

public class Coke extends ColdDrink {
    @Override
    public float price(){
        return 30.5f;
    }

    @Override
    public String name(){
        return "Coke";
    }
}
