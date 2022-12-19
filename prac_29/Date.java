package prac_29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args) {

        String regex = "((\\d{2})(\\/)(\\d{2})(\\/)(\\d{4}))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        Scanner scan = new Scanner(System.in);
        String str;
        while (true)
        {
            System.out.println("Input date in format dd/mm/yyyy:");
            str = scan.nextLine();
            if (str.equals("exit")) System.exit(0);
            matcher = pattern.matcher(str);
            if (matcher.matches())
            {
                int dd = Integer.parseInt(matcher.group(2));
                int mm = Integer.parseInt(matcher.group(4));
                int yy = Integer.parseInt(matcher.group(6));
                switch (mm) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        if (dd < 1 || dd > 31)
                            System.out.println("Incorrect input, try again");
                        else System.out.println("Great, "+matcher.group(1)+" is correct date!");
                        break;
                    }
                    case 2: {
                        if (yy % 4 == 0)
                        {
                            if (yy % 100 == 0)
                            {
                                if (yy % 400 == 0)
                                {
                                    if (dd < 1 || dd > 29)
                                        System.out.println("Incorrect input, try again");
                                    else System.out.println("Great, "+matcher.group(1)+" is correct date!");
                                }
                                else if (dd < 1 || dd > 28)
                                    System.out.println("Incorrect input, try again");
                                else System.out.println("Great, "+matcher.group(1)+" is correct date!");
                            }
                            else if (dd < 1 || dd > 29)
                                System.out.println("Incorrect input, try again");
                            else System.out.println("Great, "+matcher.group(1)+" is correct date!");
                        }
                        else
                        {
                            if (dd < 1 || dd > 28)
                                System.out.println("Incorrect input, try again");
                            else System.out.println("Great, "+matcher.group(1)+" is correct date!");
                        }
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                     {
                        if (dd < 1 || dd > 30)
                            System.out.println("Incorrect input, try again");
                        else System.out.println("Great, "+matcher.group(1)+" is correct date!");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Incorrect input, try again");
            }

        }
    }
}
