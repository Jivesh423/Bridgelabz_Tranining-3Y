import java.util.Scanner;

public class Program7 {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int[] ans = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + ans[0] + ", Largest: " + ans[1]);
        sc.close();
    }
}
