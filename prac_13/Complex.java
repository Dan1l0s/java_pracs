package prac_13;

public class Complex {
    private int real = 0;
    private int image = 0;

    public Complex(int real, int image)
    {
        this.real = real;
        this.image = image;
    }

    public Complex(){};

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String toString() {
        return (real != 0 ? real : "") + (image != 0 ? (image > 0 ? " + " + image+"i" : "0 - " + -image + "i") : (real == 0 ? "0" : ""));
    }
    public Complex sum(Complex b) {
        return new Complex(this.real + b.real, this.image + b.image);
    }
    public Complex multiply(Complex b) {
        return new Complex(this.real * b.real - this.image * b.image, this.real * this.image + +this.image * b.real);
    }
    public Complex divide(Complex b) {
        return new Complex(this.real - b.real, this.image - this.image);
    }

}
