package awt;
import java.awt.event.*;
import java.awt.*;
public class useWindow implements WindowListener
{
Frame f;

TextField tf1;
public useWindow()
{
f=new Frame("Hello AWT");

tf1=new TextField(30);
tf1.setFont(new Font("Times New Roman",Font.BOLD,45));
f.setSize(300,400);
f.setVisible(true);

f.add(tf1);
f.addWindowListener(this);
}

public void windowClosing(WindowEvent e)
{
System.exit(0);
}
public void windowOpened(WindowEvent e)
{
tf1.setText("Window is Opened");
}
public void windowClosed(WindowEvent e)
{
tf1.setText("Window is Closed");
}
public void windowIconified(WindowEvent e)
{

}
public void windowDeiconified(WindowEvent e)
{
}
public void windowActivated(WindowEvent e)
{
tf1.setText("Window is Activated");
}
public void windowDeactivated(WindowEvent e)
{
tf1.setText("Window is Deactivated");
}

public static void main(String[] args)
{
useWindow w=new useWindow();
}
}
