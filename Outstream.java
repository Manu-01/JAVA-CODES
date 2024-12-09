import java.io.*;
public class Outstream
{
public static void main(String[] args)
{
OutputStream fi=null;
byte[] b = {'M','a','n','u',' ','s','h','u','k','l','a'};
try
{
fi=new FileOutputStream("Text.txt");
fi.write(b);
for(byte i:b)
{
System.out.print((char)i);
}
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
catch(IOException e)
{
System.out.println(e);
}
}
}