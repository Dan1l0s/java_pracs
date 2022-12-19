package prac_26;

import java.util.Scanner;

public class Exception1 {
        public static void exceptionDemo() {
            while (true)
            {
//            try
//            {
//                System.out.println(2 / 0);
// //              System.out.println( 2.0 / 0.0 );
//            } catch (ArithmeticException e) {
//                System.out.println("Attempted division by zero");
//            }
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Input an integer:");
            try {
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            }
            catch (NumberFormatException e) {
                System.out.println("Incorrect integer input, try again!");
            }
            catch (ArithmeticException e)
            {
                System.out.println("Attempted  division by zero");
            }
            finally {
                System.out.println("Maybe try another number?");
                }
            }
        }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
