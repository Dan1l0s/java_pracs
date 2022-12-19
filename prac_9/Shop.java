package prac_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shop extends JFrame{

    public Shop()
    {
        super("Shop");
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JPanel SurnamePanel = new JPanel();
        JTextField Surname = new JTextField("Surname");
        Surname.setEditable(true);
        Surname.setColumns(20);
        SurnamePanel.add(Surname);

        JPanel NamePanel = new JPanel();
        JTextField Name = new JTextField("Name");
        Name.setEditable(true);
        Name.setColumns(20);
        NamePanel.add(Name);

        JPanel FathernamePanel = new JPanel();
        JTextField FatherName = new JTextField("Fathername");
        FatherName.setEditable(true);
        FatherName.setColumns(20);
        FathernamePanel.add(FatherName);

        JPanel INNPanel = new JPanel();
        JTextField INN = new JTextField("INN");
        INN.setEditable(true);
        INN.setColumns(20);
        INNPanel.add(INN);


        JButton button = new JButton();
        button.setText("Place order");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    if (Surname.getText().isEmpty() || Name.getText().isEmpty()) {
                        button.setText("Error occured!");
                        if (Surname.getText().isEmpty()) Surname.requestFocus();
                        if (Name.getText().isEmpty()) Name.requestFocus();
                        throw new CustomException("Name and Surname required");
                    }
                    String str = INN.getText();
                    if (Integer.parseInt(str.substring(0, 5)) <= 0 || str.length() != 10 && str.length() != 12) {
                        button.setText("Error occured!");
                        throw new CustomException("INN must be 10 or 12 symbols length");
                    } else {
                        button.setText("Order placed!");
                        button.setEnabled(false);
                    }
                } catch (CustomException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        panel.add(SurnamePanel);
        panel.add(NamePanel);
        panel.add(FathernamePanel);
        panel.add(INNPanel);
        panel.add(button);

        add(panel);
        setSize(300,400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Shop().setVisible(true);
    }
}