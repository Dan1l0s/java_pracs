package prac_30;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static boolean validate_password(String str)
    {
        if (str.equals("exit")) System.exit(0);

        String reg = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[0-9a-zA-Z_]{8,}";

        Pattern full_p = Pattern.compile(reg);
        Matcher full_m = full_p.matcher(str);

        if (full_m.matches())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str;
        while (true)
        {
            System.out.println("Input your password:");
            str = scan.nextLine();
            if (validate_password(str))
                System.out.println("great, it fits");
            else System.out.println("try another one");

        }
    }
}