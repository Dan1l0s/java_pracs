package prac_18;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a  = 0;
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            try {
                System.out.println("Input N (1-20):");
                a = scan.nextInt();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Incorrect input, input 1 number from 1 to 20");

            }
        }
        long fact = factorial(a);
        if (fact <= 0)
        {
            System.out.println("This value can't be reached, too big number");
        }
        else {
            System.out.println("factorial " + a + ": " + fact);
        }
    }

    public static long factorial(int a)
    {
        if (a > 20) return 0;
        long fact = 1;
        for (int i = 2; i <= a; ++i)
        {
            fact*=i;
        }
        return fact;
    }
}