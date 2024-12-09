 import java.util.Scanner;
 class Fibonacci{  
public static void main(String args[])  
{    
 int n1=-1,n2=1,n3,i,count;    
//  System.out.print(n1+" "+n2);//printing 0 and 1   
 Scanner s= new Scanner(System.in); 
 System.out.println("Enter the First N number : ");
 count=s.nextInt();
    
 for(i=0;i<count;++i)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  