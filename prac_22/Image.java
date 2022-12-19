package prac_22;

import prac_9.CustomException;
import prac_9.Shop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Image extends JFrame {
    public Image()
    {
        super("Image");


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JPanel PathPanel = new JPanel();
        JTextArea hint = new JTextArea("Input Image Path:");
        hint.setEditable(false);
        PathPanel.add(hint);
        JTextField Path = new JTextField();
        Path.setEditable(true);
        Path.setColumns(80);
        PathPanel.add(Path);

        JLabel image = new JLabel();

        int width = 1500, height = 1500;

        JButton button = new JButton();
        button.setText("Submit path");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    String str = Path.getText();
                    ImageIcon imageicon = new ImageIcon(str);
                    if (imageicon.getIconWidth() < 400) button.setText("Incorrect path");
                    else
                    {
                        button.setText("Submit path");
                        setSize(imageicon.getIconWidth() + 50, imageicon.getIconHeight() + 100);
                        setLocationRelativeTo(null);
                        image.setIcon(imageicon);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        PathPanel.add(button);


        panel.add(PathPanel);
        panel.add(image);


        add(panel);
        setSize(1500,1500);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Image().setVisible(true);
    }
}
