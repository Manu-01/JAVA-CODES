package awt;
import java.awt.*;

 class Xyz
{
    Frame f1;
    Panel p1;
    TextField t1,t2;
    Label l1,l2;
    Button b1;

    public Xyz()
    {
        f1 = new Frame();
        f1.setVisible(true);
        f1.setSize(400,400);
        p1=new Panel();
        t1=new TextField(15);
        t2=new TextField(15);
        l1=new Label("Enter First Number ");
        l2=new Label("Enter Second Number");
        b1=new Button("submit");
        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(t2);
        p1.add(b1);
        f1.add(p1);




    }
}
public class awt {
    public static void main(String args[])
    {
        new Xyz();
    }
}