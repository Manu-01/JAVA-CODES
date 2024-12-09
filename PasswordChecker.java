public class PasswordChecker {
    public static boolean checkPassword(char[] str, int n) {
        // Check if password length is at least n
        if (str.length < n) {
            return false;
        }
        
        // Check if password contains at least one uppercase letter, one lowercase letter, and one digit
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        
        for (char ch : str) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        
        return hasUpperCase && hasLowerCase && hasDigit;
    }
    
    public static void main(String[] args) {
        // Example usage
        char[] password1 = "StrongPassword123".toCharArray();
        char[] password2 = "weakpassword".toCharArray();
        
        int requiredLength = 8;
        
        System.out.println("Password 1 meets criteria: " + checkPassword(password1, requiredLength));
        System.out.println("Password 2 meets criteria: " + checkPassword(password2, requiredLength));
    }
}

