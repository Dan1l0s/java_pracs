package prac_21;

public class Dog implements Nameable{
    private String name;

    Dog(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
