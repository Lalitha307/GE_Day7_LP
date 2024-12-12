import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = inputScanner.nextInt();
        int reversedNumber = computeReversedNumber(originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        inputScanner.close();
    }
    public static int computeReversedNumber(int originalNumber) {
        int reversedResult = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedResult = reversedResult * 10 + digit;
            originalNumber = originalNumber / 10;
        }
        return reversedResult;
    }
}