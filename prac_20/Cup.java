package prac_20;

public class Cup extends  Dish{
    Cup(String color, int diameter) {
        super(color, diameter, true);
    }

    Cup(String color, int diameter, boolean is_broken)
    {
        super(color, diameter, true, is_broken);
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
            System.out.println("u used " + super.getColor() + " cup to drink");
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
            System.out.println("u washed " + super.getColor() + " cup");
        }
    }
}
