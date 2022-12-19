package prac_21;


public class Planet implements Nameable {

    Planet(String name)
    {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }
}
