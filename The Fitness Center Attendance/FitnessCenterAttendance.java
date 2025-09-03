// 2. The Fitness Center Attendance 
// A gym tracks attendance for 10 days using an array.
// Use a for loop to calculate the total number of visitors in 10 days.
// Identify the day with the maximum attendance.
// Find the minimum attendance day.
// Display all days where attendance was above the average.
public class FitnessCenterAttendance {
    public static void main(String[] args) {
        int[] attendance = {55, 62, 48, 70, 65, 59, 78, 51, 68, 73};

        int totalAttendance = 0;
        int maxAttendance = attendance[0];
        int maxDay = 0;
        int minAttendance = attendance[0];
        int minDay = 0;

        for (int i = 0; i < attendance.length; i++) {
            totalAttendance += attendance[i];
            if (attendance[i] > maxAttendance) {
                maxAttendance = attendance[i];
                maxDay = i;
            }
            if (attendance[i] < minAttendance) {
                minAttendance = attendance[i];
                minDay = i;
            }
        }

        double averageAttendance = (double) totalAttendance / attendance.length;

        System.out.println("Total attendance for 10 days: " + totalAttendance);
        System.out.println("Day with maximum attendance: Day " + (maxDay + 1) + " with " + maxAttendance + " visitors.");
        System.out.println("Day with minimum attendance: Day " + (minDay + 1) + " with " + minAttendance + " visitors.");

        System.out.println("Days with attendance above average (" + String.format("%.2f", averageAttendance) + "):");
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] > averageAttendance) {
                System.out.println("Day " + (i + 1) + ": " + attendance[i] + " visitors");
            }
        }
    }
}
