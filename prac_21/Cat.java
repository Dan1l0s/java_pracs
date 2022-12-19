package prac_21;

public class Cat implements Nameable{
    private String name;

    Cat(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}