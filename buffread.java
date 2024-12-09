import java.io.*;
public class buffread
{
public static void main(String[] args)throws IOException
{
try
{
//BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\buff.txt"));

BufferedWriter bw=new BufferedWriter(new FileWriter(args[0]));
bw.write("We are using this buffered reader class");
bw.flush();
bw.close();
BufferedReader br=new BufferedReader(new FileReader(args[1]));

String s=br.readLine();
System.out.print(s);
br.close();
}
catch(Exception e)
{
System.out.println(e);
}
System.err.println("error message");  
}
}

