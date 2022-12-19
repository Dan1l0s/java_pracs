package prac_14;

public class MagicChair extends Chair{
    public void doMagic()
    {
        System.out.println("Magic happened :/");
    }
    @Override
    public void action()
    {
        System.out.println("that's a magic chair!");
        doMagic();
    }
}
