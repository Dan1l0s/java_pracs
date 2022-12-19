package prac_14;

import java.util.Scanner;

public class FunctionalChair extends Chair{
    public int sum(int a, int b)
    {
        return a+b;
    }
    @Override
    public void action()
    {
        System.out.println("that's a functional chair!");
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a, b:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a+"+"+b+"="+sum(a,b));
    }
}
