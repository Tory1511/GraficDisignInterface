package geekbrains.ru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow
{
    MyWindow()
    {
        JFrame f = new JFrame("Password Generator");

        //entry
        JLabel label = new JLabel();
        label.setText("Enter password length");
        label.setBounds(10, 10, 200, 30);

        //generated password
        JLabel outLabel = new JLabel();
        outLabel.setText("Your new password");
        outLabel.setBounds(10, 40, 200, 30);

        //Scanner Field
        JTextField textField = new JTextField();
        textField.setBounds(210, 10, 130, 30);

        //Generate Button
        JButton buttonGenerator = new JButton("Generate your Random password");
        buttonGenerator.setBounds(100,80,240, 30);
        buttonGenerator.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    Generator generator = new Generator(textField.getText());
                    generator.generate();
                    outLabel.setText(generator.password);
                }
                catch (Exception exception)
                {
                    outLabel.setText("Invalid input");
                }


            }
        });

        //Exit button
        JButton buttonExit = new JButton("Exit");
        buttonExit.setBounds(100,120,240, 30);
        buttonExit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                System.exit(0);
            }
        });


        f.add(label);
        f.add(outLabel);
        f.add(textField);
        f.add(buttonGenerator);
        f.add(buttonExit);

        f.setSize(400,400);
        f.setLocation(650,500 );
        f.setLayout(null);
        f.setVisible(true);


        f.setTitle("Password Generator");
        f.setBackground(Color.GRAY);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }




}
