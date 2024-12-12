import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int termCount = inputScanner.nextInt();
        System.out.println("Fibonacci Series up to " + termCount + " terms:");
        generateFibonacciSeries(termCount);
        inputScanner.close();
    }
    public static void generateFibonacciSeries(int termCount) {
        int previousTerm = 0, currentTerm = 1;
        System.out.print(previousTerm + " " + currentTerm + " ");
        for (int index = 2; index < termCount; index++) {
            int newTerm = previousTerm + currentTerm;
            System.out.print(newTerm + " ");
            previousTerm = currentTerm;
            currentTerm = newTerm;
        }
    }
}
