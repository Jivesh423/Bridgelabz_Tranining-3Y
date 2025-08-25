public class NumberChecker5 {

    // Method to check Perfect number
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    // Method to check Abundant number
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    // Method to check Deficient number
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    // Helper: factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // Method to check Strong number
    public static boolean isStrong(int num) {
        int n = num, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += factorial(d);
            n /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 145; // try 6, 12, 28 also

        System.out.println("Number: " + number);
        System.out.println("Perfect? " + isPerfect(number));
        System.out.println("Abundant? " + isAbundant(number));
        System.out.println("Deficient? " + isDeficient(number));
        System.out.println("Strong? " + isStrong(number));
    }
}
