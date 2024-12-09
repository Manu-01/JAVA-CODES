import java.util.*;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binaryString = sc.nextLine();
        int[] charValues = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = binaryString.length();
        int[] dp = new int[n];
        dp[0] = 0;
        char prevChar = binaryString.charAt(0);
        for (int i = 1; i < n; i++) {
            char currChar = binaryString.charAt(i);
            if (currChar != prevChar) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = dp[i - 1];
            }
            prevChar = currChar;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += charValues[i] * (i - dp[i]);
        }
        System.out.println(sum);
    }
}