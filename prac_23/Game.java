package prac_23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    private int attempts = 0;
    private int num = -1;
    public Game()
    {
    super("Game");
    num = (int)(Math.random()*100) % 21;
    JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

    JPanel NumPanel = new JPanel();
    JTextArea hint = new JTextArea("Input number (0-20):");
        hint.setEditable(false);
        panel.add(hint);
    JTextField Num = new JTextField();
        Num.setEditable(true);
        Num.setColumns(4);
        NumPanel.add(Num);

        JPanel FeedbackPanel = new JPanel();
        JTextArea ans = new JTextArea();
        ans.setVisible(false);
        ans.setEditable(false);
        FeedbackPanel.add(ans);

        JButton button = new JButton();
        button.setText("Try to guess");
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {
            String str = Num.getText();
            int number;
            try {
                number = Integer.parseInt(str);
                if (number < 0 || number > 20)
                {
                    ans.setVisible(true);
                    ans.setText("Incorrect input! number must be 0-20");
                }
                else {
                    if (number == num)
                    {
                        System.out.println("Correct! The number was " + num);
                        System.exit(0);
                    }
                    else
                    {
                        attempts++;
                        if (attempts == 3)
                        {
                            System.out.println("You've lost, the number was " + num + ", try again :c");
                            System.exit(-1);
                        }
                        if (number < num)
                        {
                            ans.setVisible(true);
                            ans.setText("Guessed num is bigger than " + number + ", " +(3-attempts) +" attempt(s) left");
                        }
                        else
                        {
                            ans.setVisible(true);
                            ans.setText("Guessed num is less than " + number + ", " +(3-attempts) +" attempt(s) left");
                        }
                    }
                }
            }
            catch (NumberFormatException e) {
                number = -1;
                ans.setVisible(true);
                ans.setText("Incorrect input! number must be 0-20 and contain only digits");
            }
        }
    });

        panel.add(NumPanel);
        panel.add(button);
        panel.add(FeedbackPanel);

    add(panel);
    setSize(300,125);
    setLocationRelativeTo(null);
}

    public static void main(String[] args) {
        new Game().setVisible(true);
    }

}
