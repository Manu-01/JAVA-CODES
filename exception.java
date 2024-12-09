import java.lang.*;
class Exceptipon
{
public static void main(String []args)
{
try
{
int myInt = Integer.parseInt("manu");
}
catch(NumberFormatException nfe)
{
System.out.println("this can not be happen");
}
}
}