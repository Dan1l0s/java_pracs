package prac_14;

public class VictorianChair extends Chair{
    private int age;

    public int getAge() {return age;}
    public VictorianChair(int age)
    {
        this.age = age;
    }
    @Override
    public void action()
    {
        System.out.println("that's a victorian chair!");
        System.out.println("It's age is "+ age);
    }
}
