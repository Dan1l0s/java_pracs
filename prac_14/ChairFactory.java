package prac_14;

import java.util.Scanner;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input victorian chair age:");
        int age = scan.nextInt();
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
