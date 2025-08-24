import java.util.Scanner;

public class Arithemetic_series {

    // 9+13+17+...n
    static int series_1(int n) {
        int sum = 0;
        for (int i = 1, term = 9; i <= n; i++, term += 4) {
            sum += term;
        }
        return sum;
    }

    // x^1+x^2+x^3+...n
    static int series_2(int n, int x) {
        int sum = 0;
        int term = 1;
        for (int i = 1; i <= n; i++) {
            term *= x;
            sum += term;
        }
        return sum;
    }

    // 9^2+13^2+17^2+...n
    static int series_3(int n) {
        int sum = 0;
        for (int i = 1, term = 9; i <= n; i++, term += 4) {
            sum += term * term;
        }
        return sum;
    }

    // (1^3)/x + (2^3)/x + (3^3)/x ... n
    static double series_4(int n, int x) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (Math.pow(i, 3)) / (double) x;
        }
        return sum;
    }

    // 2^x + 4^x + 6^x ... n
    static double series_5(int n, int x) {
        double sum = 0;
        for (int i = 1, term = 2; i <= n; i++, term += 2) {
            sum += Math.pow(term, x);
        }
        return sum;
    }

    // 2/10 + 4/9 + 6/8 ... n
    static double series_6(int n) {
        double sum = 0;
        for (int i = 1, term = 2; i <= n; i++, term += 2) {
            sum += (double) term / (10 - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Sum of series 1: " + series_1(n));
        System.out.println("Sum of series 2: " + series_2(n, x));
        System.out.println("Sum of series 3: " + series_3(n));
        System.out.println("Sum of series 4: " + series_4(n, x));
        System.out.println("Sum of series 5: " + series_5(n, x));
        System.out.println("Sum of series 6: " + series_6(n));

        sc.close();
    }
}
