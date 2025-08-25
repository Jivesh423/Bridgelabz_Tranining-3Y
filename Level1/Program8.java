import java.util.Scanner;

public class Program8 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int num = sc.nextInt(), div = sc.nextInt();
        int[] ans = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + ans[0] + ", Remainder: " + ans[1]);
        sc.close();
    }
}
