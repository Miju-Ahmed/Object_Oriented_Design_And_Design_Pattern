package Object_Oriented_Design_And_Design_Pattern.Builder_Pattern;

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
