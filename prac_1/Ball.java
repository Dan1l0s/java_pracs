package prac_1;

public class Ball {

    private String material;
    private String color;
    private int diameter;

    public Ball(String material, String color, int diameter) {
        this.material = material;
        this.color = color;
        this.diameter = diameter;
    }

    public Ball(int diameter, String color)
    {
        this.color = color;
        this.diameter = diameter;
        this.material = "rubber";
    }

    public Ball()
    {
        this.color = "Black";
        this.diameter = 0;
        this.material = "rubber";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString()
    {
        return "Ball("+this.color+", "+this.material+", " +this.diameter+")";
    }
}
