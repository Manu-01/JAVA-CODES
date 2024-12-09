import java.util.*;
class Base
{
public Base(int x)
{
System.out.println(x);
}
}
class child extends Base
{
public child(int a, int b)
{
super(5);
System.out.println(a+b);
}
}
class SuperExample
{
public static void main(String[] args)
{
child obj1=new child(4,6);
}
}
