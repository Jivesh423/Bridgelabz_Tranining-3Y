import java.util.Random;

public class FootballTeamHeights {

    // Method to calculate sum of elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    // Method to calculate mean height
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150 - 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // (0–100) + 150 = 150–250
        }

        // Display heights
        System.out.print("Player Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        // Display results
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
