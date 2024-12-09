public class ConcatOverload {

  
    public String concat(String str1, String str2) {
        return str1 + str2;
    }


    public String concat(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }


    public String concat(int num1, int num2) {
        return String.valueOf(num1) + String.valueOf(num2);
    }

    public String concat(int num, String str) {
        return String.valueOf(num) + str;
    }

    
    public String concat(String str, int num) {
        return str + String.valueOf(num);
    }

    public static void main(String[] args) {
        ConcatOverload co = new ConcatOverload();


        System.out.println("Concatenating two strings: " + co.concat("Hello, ", "java!"));
        System.out.println("Concatenating three strings: " + co.concat("Java ", "is ", "awesome!"));
        System.out.println("Concatenating two integers: " + co.concat(100, 200));
        System.out.println("Concatenating an integer and a string: " + co.concat(123, "abc"));
        System.out.println("Concatenating a string and an integer: " + co.concat("abc", 123));
    }
}