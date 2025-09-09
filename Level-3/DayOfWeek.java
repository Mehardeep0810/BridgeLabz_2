package Assigned2.level3;

public class DayOfWeek {
    public static void main(String[] args) {
        // Ensure three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse input arguments
        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year

        // Step 1: Adjust year based on month
        int y0 = y - (14 - m) / 12;

        // Step 2: Compute x using Gregorian leap year corrections
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Adjust month
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Compute day of week
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        System.out.println("Day of the week (0=Sunday, ..., 6=Saturday): " + d0);
    }
}
