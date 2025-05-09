package Object_Oriented_Design_And_Design_Pattern.Builder_Pattern;

public abstract class Burger implements Item{
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
