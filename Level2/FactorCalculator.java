import java.util.Scanner;

public class FactorCalculator {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static long productFactors(int[] arr) {
        long product = 1;
        for (int x : arr) product *= x;
        return product;
    }

    public static double sumSquareFactors(int[] arr) {
        double sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Sum of squares of factors: " + sumSquareFactors(factors));
    }
}
