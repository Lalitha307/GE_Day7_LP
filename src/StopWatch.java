import java.util.Scanner;

public class StopWatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to Start the Timer.");
        scanner.nextLine();  // Wait for the user to press Enter to start
        long beginTime = System.currentTimeMillis();  // Capture the start time
        System.out.println("Timer started. Press Enter to Stop the Timer.");
        scanner.nextLine();  // Wait for the user to press Enter to stop
        long finishTime = System.currentTimeMillis();  // Capture the end time
        long duration = finishTime - beginTime;  // Calculate elapsed time in milliseconds
        System.out.println("Duration: " + duration + " milliseconds");

        scanner.close();
    }
}
