package prac_3;

public class Square extends Rectangle {
    public Square() {
        this.length = 10;
        this.width = 10;
    }
    public Square(double side)
    {
        this.length = side;
        this.width = side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide()
    {
        return this.length;
    }
    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }
    @Override
    public void setWidth(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString()
    {
        return "Shape: square, side: "+this.length+(filled ? ", color: "+this.color : ".");
    }
}
