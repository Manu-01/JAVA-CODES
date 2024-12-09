import java.io.*;
public class dinput
{
public static void main(String args[])
{
int a=20;
float b=34.56f;
double c=78.908;
boolean d=true;
try
{
FileOutputStream fo=new FileOutputStream("D:\\Demo.txt");
DataOutputStream ds=new DataOutputStream(fo); 

ds.writeInt(a);
ds.writeFloat(b);
ds.writeDouble(c);
ds.writeBoolean(d);
ds.flush();
System.out.println("data written");
ds.close();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}