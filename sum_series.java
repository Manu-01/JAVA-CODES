import java.lang*;
class Main {
    public static double sum_series(int x, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i += 2) {
            if (i % 2 == 1) {
                sum += x / (double) i;
            } else {
                sum -= x / (double) i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum_series(5, 4));
    }
}
