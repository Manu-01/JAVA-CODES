import java.io.*;
public class Aread
{
public static void main(String[] args)throws IOException
{
int i;
while((i=System.in.read())!=-1)
{
System.out.print((char)i);
}
System.err.println("error message");  
}
}