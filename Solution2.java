import java.util.*;
import java.lang.*;
class check{
  public static boolean checkPassword(String s,int n){
   if(n<4){
    return false;
   }
   if(s.charAt(0)>=1 && s.charAt(0)<=9){
     return false;
   }
  int c=0,u=0,d=0;
  for(int i=0;i<n;i++){
      if(s.charAt(i)==' ' || s.charAt(i)=='/'){
       return false;
      }

     if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
       c++;
     }
     if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
       u++;
      }
     if(s.charAt(i)==' '){
       return false;
      }
  }
  if(c>=4 && u>=1){
    return true;
   }else{
  return false;
  }
  
}


  public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Password!!");
  String s=sc.next();
  int n=s.length();
  //char[] ch = s.toCharArray();
  System.out.println(checkPassword(s,n));
 }
}