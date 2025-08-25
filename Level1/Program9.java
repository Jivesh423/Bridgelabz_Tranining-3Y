import java.util.Scanner;

public class Program9 {
    public static int[] distributeChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int choco = sc.nextInt(), child = sc.nextInt();
        int[] ans = distributeChocolates(choco, child);
        System.out.println("Each child gets " + ans[0] + " chocolates, Remaining: " + ans[1]);
        sc.close();
    }
}
