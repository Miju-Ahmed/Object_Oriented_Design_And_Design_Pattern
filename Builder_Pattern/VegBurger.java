package Object_Oriented_Design_And_Design_Pattern.Builder_Pattern;

public class VegBurger extends Burger{
    @Override
    public float price(){
        return 50.0f;
    }

    @Override
    public String name(){
        return "VegBurger";
    }
}
