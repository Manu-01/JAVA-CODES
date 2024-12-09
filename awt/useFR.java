package awt;
import java.awt.*;
public class useFR
{
Frame f1;
Label l1,l2,l3;
TextField tf1,tf2,tf3;
Button b1,b2;
Panel p1,p2;
public useFR()
{
f1=new Frame("USE FRAME");
f1.setVisible(true);
f1.setSize(300,300);
p1=new Panel();
l1=new Label("user Name");
l2=new Label("Password");
l3=new Label("email");
tf1=new TextField(20);
tf2=new TextField(20);
tf3=new TextField(22);
b1=new Button("Submit");
b2=new Button("Reset");
f1.add(p1);
p1.add(l1);
p1.add(tf1);
p1.add(l2);
p1.add(tf2);
p1.add(l3);
p1.add(tf3);
p1.add(b1);
p1.add(b2);
}
public static void main(String[] a)
{
useFR f=new useFR();
}
}