package Object_Oriented_Design_And_Design_Pattern.Builder_Pattern;

public class ChickenBurger extends Burger{
    @Override
    public float price(){
        return 105.5f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }
}
