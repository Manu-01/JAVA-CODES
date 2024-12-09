package awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Acomp extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;
    JPanel p1;

    public Acomp() {
        super("Swing Frame");
        setVisible(true);
        setSize(400, 500);
        l1 = new JLabel("Enter Ist No.");
        l2 = new JLabel("Enter II No.");
        l3 = new JLabel("Total");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t3.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));

        b1 = new JButton("Sum");
        b2 = new JButton("subtract");
        p1 = new JPanel();
        add(p1);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(b1);
        p1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b, c;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        if (e.getSource() == b1) {
            c = a + b;
            t3.setText("Sum of a" + a + " and b" + b + " = " + c);
            JOptionPane.showMessageDialog(p1, "Sum of a" + a + " and b" + b + " = " + c, "Sum",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == b2) {
            c = a - b;
            t3.setText("Subtraction of a" + a + " and b" + b + " = " + c);
        }
    }

    public static void main(String[] args) {
        Acomp s = new Acomp();
    }
}