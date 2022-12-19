package prac_17;

final public class Drink implements Item {
    final private double cost;
    final private String name;
    final private String desc;

    public Drink(String name, String desc)
    {
        this.cost = 0;
        this.name = name;
        this.desc = desc;
    }
    public Drink(String name, String desc, double cost) {
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
