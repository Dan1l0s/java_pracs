package prac_5;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scan.nextInt();
        System.out.println("Task 1:");
        task_1(1, n, 0);
        System.out.println("\nTask 2:");
        task_2(n);
        System.out.println("\nInput a, b:");
        int a = scan.nextInt(), b = scan.nextInt();
        System.out.println("Task 3:");
        task_3(a, b);
    }

    public static void task_1(int num, int n, int cnt)
    {
        for (int i = 0; i < num && cnt < n; ++i)
        {
            cnt++;
            System.out.print(num+" ");
        }
        if (cnt != n)
        {
            task_1(num+1, n, cnt);
        }
    }
    public static void task_2(int n)
    {
        if (n > 1) task_2(n-1);
        System.out.print(n+" ");
    }
    public static void task_3(int a, int b)
    {
        System.out.print(a+" ");
        if (a != b) {
            if (a > b) task_3(--a, b);
            else task_3(++a, b);
        }
    }
}
