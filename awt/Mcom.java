package awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mcom extends JFrame implements ActionListener {
    JTextField tf1, tf2, tf3;
    JPanel p1;
    JLabel l1, l2;
    JButton b1, b2;

    Mcom() {
        setSize(300, 300);
        setVisible(true);
        p1 = new JPanel();
        l1 = new JLabel("Enter First No:");
        l2 = new JLabel("Enter Second No:");
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);
        tf3 = new JTextField(15);
        b1 = new JButton("Sum");
        add(p1);
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(b1);
        p1.add(tf3);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b, c;
        if (e.getSource() == b1)
            ;
        a = Integer.parseInt(tf1.getText());
        b = Integer.parseInt(tf2.getText());
        c = a + b;
        tf3.setText(String.valueOf(c));
    }
}

public static void main(String args[]) {
    new Mcom();
}
