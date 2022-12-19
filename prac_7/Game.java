package prac_7;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue player1 = new LinkedList();
        Queue player2 = new LinkedList();
        int cnt = 0;
        int tmp1, tmp2;
        for (int i = 0; i < 10; ++i)
        {
            tmp1 = scan.nextInt();
            if (i < 5) player1.add(tmp1);
            else player2.add(tmp1);
        }

        while (cnt < 106 && !player1.isEmpty() && !player2.isEmpty())
        {
            cnt++;
            tmp1 = (int) player1.remove();
            tmp2 = (int) player2.remove();
            if (tmp1 == 0 && tmp2 == 9 || (tmp1 > tmp2 && !(tmp1 == 9 && tmp2 == 0)))
            {
                player1.add(tmp1);
                player1.add(tmp2);
            }
            else
            {
                player2.add(tmp2);
                player2.add(tmp1);
            }
        }
        if (cnt == 106) {
            System.out.println("botva");
        }
        else
        {
            if (player1.isEmpty()) System.out.println("second " + cnt);
            else System.out.println("first " + cnt);
        }
    }

}
