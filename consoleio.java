import java.io.*;
public class Consoleio
{
public static void main(String[] args)throws IOException
{
try
{
int i;
float f;
String sname;

BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));

i=Integer.parseInt(br.readLine());
f=Float.parseFloat(br.readLine());
sname=br.readLine();

System.out.println("Enter Inputs are");
System.out.println("Roll no"+i);
System.out.println("fees"+f);
System.out.println("Name"+sname);
br.close();
}
catch(Exception e)
{
System.out.println(e);
}
System.err.println("error message");
}
}