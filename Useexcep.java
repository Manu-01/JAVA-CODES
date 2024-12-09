public class InvalidAgeException extends Exception
{
public InvalidAgeException(String a)
{
super(a);
}
}
public class Useexcep
{
public void checkAge(int age) throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("Age is invalid");
}
else
{
System.out.println("age");
}
}
public static void main(String[] args)
{
Useexcep u = new Useexcep();
try{
u.checkAge(16);
}
catch(InvalidAgeException e)
{
System.out.println(e);
}
}
}