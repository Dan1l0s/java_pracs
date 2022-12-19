package prac_10;

public class Shirt {

    private String desc;

    public Shirt(String str)
    {
        desc = str;
    }

    @Override
    public String toString() {
        String ans = "", rest = desc;

        ans = "Article number: "+rest.substring(0, rest.indexOf(','));
        rest = rest.substring(rest.indexOf(',')+1);

        ans += ", Name: "+rest.substring(0, rest.indexOf(','));
        rest = rest.substring(rest.indexOf(',')+1);

        ans += ", Color: "+rest.substring(0, rest.indexOf(','));
        rest = rest.substring(rest.indexOf(',')+1);

        ans += ", Size: " + rest +".";

        return ans;
    }

    public static void main(String[] args) {
        String clothes[] = new String[11];
        clothes[0] = "S001,Black Polo Shirt,Black,XL";
        clothes[1] = "S002,Black Polo Shirt,Black,L";
        clothes[2] = "S003,Blue Polo Shirt,Blue,XL";
        clothes[3] = "S004,Blue Polo Shirt,Blue,M";
        clothes[4] = "S005,Tan Polo Shirt,Tan,XL";
        clothes[5] = "S006,Black T-Shirt,Black,XL";
        clothes[6] = "S007,White T-Shirt,White,XL";
        clothes[7] = "S008,White T-Shirt,White,L";
        clothes[8] = "S009,Green T-Shirt,Green,S";
        clothes[9] = "S010,Orange T-Shirt,Orange,S";
        clothes[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt shirts[] = new Shirt[11];
        for (int i = 0; i < 11; ++i)
        {
            shirts[i] = new Shirt(clothes[i]);
        }

        for (int i = 0; i < 11; ++i)
        {
            System.out.println(shirts[i]);
        }

    }
}
