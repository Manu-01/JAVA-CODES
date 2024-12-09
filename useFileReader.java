import java.io.*;
public class useFileReader
{
public static void main(String args[])
{
try
{
FileReader fr=new FileReader("fileread.txt");
FileWriter fw=new FileWriter("fileread.txt");
//char data='a';
//fw.write(data);
String File="This is my file and it is used in file handling";

char a[]=File.toCharArray();
fw.write(a);
fw.write(File);

fw.flush();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}