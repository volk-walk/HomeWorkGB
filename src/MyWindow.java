import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame
{
    MyWindow()
    {
        setVisible(true);
        setLocation(700,350);
        setSize(500,500);
        setTitle("Окно");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));


        JButton btn1 = new JButton("Выход");
        panel.add(btn1);
        ActionListener actionListener=new CloseActionListener();

        btn1.addActionListener(actionListener);

        JButton btn2 = new JButton("Старт");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);


    }
}
