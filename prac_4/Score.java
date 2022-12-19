package prac_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {

    int counter1 = 0;
    int counter2 = 0;

    JButton btn1 = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");

    JLabel txt1 = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    JLabel txt2 = new JLabel("Last scorer: N/A", SwingConstants.CENTER);
    JLabel txt3 = new JLabel("Winner: DRAW", SwingConstants.CENTER);


    public Score()
    {
        super("Game");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        add(btn1, BorderLayout.WEST);
        add(btn2, BorderLayout.EAST);
        add(txt1, BorderLayout.CENTER);
        add(txt2, BorderLayout.NORTH);
        add(txt3, BorderLayout.SOUTH);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter1++;
                txt1.setText("Result: "+counter1+" X "+counter2);
                txt2.setText("Last scorer: AC Milan");
                txt3.setText("Winner: "+(counter1 == counter2 ? "DRAW" : (counter1 > counter2 ? "AC Milan" : "Real Madrid")));
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter2++;
                txt1.setText("Result: "+counter1+" X "+counter2);
                txt2.setText("Last scorer: Real Madrid");
                txt3.setText("Winner: "+(counter1 == counter2 ? "DRAW" : (counter1 > counter2 ? "AC Milan" : "Real Madrid")));
            }
        });

    }

    public static void main(String[] args) {
        new Score().setVisible(true);
    }
}
