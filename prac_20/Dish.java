package prac_20;

public abstract class Dish {
    private int diameter;
    private boolean is_deep;
    private String color;
    private boolean is_broken = false;

    Dish(String color, int diameter, boolean is_deep, boolean is_broken)
    {
        this.is_broken = is_broken;
        this.color = color;
        this.diameter = diameter;
        this.is_deep = is_deep;
    }
    Dish(String color, int diameter, boolean is_deep)
    {
        this.color = color;
        this.diameter = diameter;
        this.is_deep = is_deep;
    }
    public int getDiameter() {
        return diameter;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public boolean is_deep() {
        return is_deep;
    }
    public void set_deep(boolean is_deep) {
        this.is_deep = is_deep;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean is_broken() {
        return is_broken;
    }
    public void set_broken(boolean is_broken) {
        this.is_broken = is_broken;
    }
    public abstract void become_broken();
    public abstract void use();
    public abstract void wash();
}
