package prac_20;

public class Plate extends Dish {

    Plate(String color, int diameter, boolean is_deep) {
        super(color, diameter, is_deep);
    }

    Plate(String color, int diameter, boolean is_deep, boolean is_broken)
    {
        super(color, diameter, is_deep, is_broken);
    }

    @Override
    public void become_broken()
    {
        if (!super.is_broken())
        {
            super.set_broken(true);
            System.out.println("welp, it's broken");
        }
        else {
            System.out.println("nope, it's already broken");
        }
    }
    @Override
    public void use()
    {
        if (super.is_broken())
        {
            System.out.println("nope, it's broken");
        }
        else
        {
            System.out.println("u used " + super.getColor() + " plate to eat");
        }
    }
    @Override
    public void wash()
    {
        if (super.is_broken())
        {
            System.out.println("nope, it's broken");
        }
        else
        {
            System.out.println("u washed " + super.getColor() + " plate");
        }
    }


}