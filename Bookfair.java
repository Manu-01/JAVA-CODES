import java.util.Scanner;

public class BookFair
{
    private String bname;
    private double price;
    
    public BookFair() {
        bname = "";
        price = 0.0;
    }
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of the book: ");
        bname = in.nextLine();
        System.out.print("Enter price of the book: ");
        price = in.nextDouble();
    }
    
    public void calculate() {
        double disc;
        if (price <= 1000)
            disc = price * 0.02;
        else if (price <= 3000)
            disc = price * 0.1;
        else
            disc = price * 0.15;
            
        price -= disc;
    }
    
    public void display() {
        System.out.println("Book Name: " + bname);
        System.out.println("Price after discount: " + price);
    }
    
    public static void main(String args[]) {
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
