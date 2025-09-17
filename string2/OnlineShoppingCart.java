import java.util.Scanner;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of product " + i + ": ");
            total += sc.nextDouble();
        }

        if (total > 5000) {
            total *= 0.9;
        } else if (total < 2000) {
            total += 100;

        }

        System.out.println("Final payable amount: " + total);
        sc.close();
    }
}
