import java.util.*;
public class Sum
{
String a;
String b;
public Sum(String name , String id)
{
this.name=name;
this.id=id;
}
public static void main(String[] args)
{
Sum b = new Sum("MANU","SHUKLA");
System.out.println("Name is"+b.name+ "id is"+b.id);
}
}