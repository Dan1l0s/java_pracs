    package prac_12;

    import java.util.Scanner;

    public class Phone {
        private String num = "none";

        public String getNum()
        {
            return num;
        }

        public void setNum(String str)
        {
            if (str.length() == 11 && str.charAt(0) == '8')
            {
                num = "+7-"+str.substring(1, 4)+"-"+str.substring(4, 7)+"-"+str.substring(7);
            }
            else if (str.length() > 11 && str.length() < 16 && str.charAt(0) == '+')
            {
                int size = str.length()-1;
                num = str.substring(0, size-9)+"-"+str.substring(size-9, size-6)+"-"+str.substring(size-6, size-3)+"-"+str.substring(size-3);
            }
            else
            {
                System.out.println("Incorrect number, try again");
            }
        }


        public static void main(String[] args) {
            Phone phone = new Phone();
            String str;
            Scanner scan = new Scanner(System.in);
            while (true)
            {
                System.out.println("Input phone number:");
                str = scan.nextLine();
                if (str.equals("exit")) System.exit(0);
                phone.setNum(str);
                if (phone.getNum() != "none") System.out.println(phone.getNum());
            }
        }
    }
