package prac_3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle()
    {
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, length: "+this.length+", width: "+this.width+(filled ? ", color: "+this.color : ".");
    }


}
