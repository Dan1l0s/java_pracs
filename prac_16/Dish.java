package prac_16;

final public class Dish implements Item {
    final private double cost;
    final private String name;
    final private String desc;

    public Dish(String name, String desc)
    {
        this.cost = 0;
        this.name = name;
        this.desc = desc;
    }
    public Dish(double cost, String name, String desc) {
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
