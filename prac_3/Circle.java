package prac_3;

public class Circle extends Shape{
    protected double radius;
    public Circle()
    {
        filled = false;
        radius = 0;
        color = "black";
    }
    public Circle (double radius)
    {
        this.radius = radius;
        filled = false;
        color = "black";
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*Math.PI*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+(filled ? ", color: "+this.color : ".");
    }
}
