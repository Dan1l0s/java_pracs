package prac_16;

final public class Drink implements Item {
    final private double cost;
    final private String name;
    final private String desc;

    public Drink(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
        this.cost = 0;
    }
    public Drink(double cost, String name, String desc) {
        this.cost = cost;
        this.name = name;
        this.desc = desc;
    }
    @Override
    public double getCost() {
        return cost;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDesc() {
        return desc;
    }
}
