import java.util.Arrays;

public class NumberChecker3 {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check Palindrome number
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] rev = reverseArray(digits);
        return compareArrays(digits, rev);
    }

    // Method to check Duck number (contains zero, not starting with zero)
    public static boolean isDuck(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && !s.startsWith("0");
    }

    public static void main(String[] args) {
        int number = 707;  // test with other numbers like 12321, 1203 etc.

        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + countDigits(number));

        int[] digits = getDigits(number);
        System.out.print("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Array: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        System.out.println("Arrays Equal? " + compareArrays(digits, reversed));
        System.out.println("Palindrome Number? " + isPalindrome(number));
        System.out.println("Duck Number? " + isDuck(number));
    }
}
