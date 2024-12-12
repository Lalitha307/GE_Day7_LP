import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = inputScanner.nextInt();
        if (checkPerfectNumber(inputNumber)) {
            System.out.println(inputNumber + " is a Perfect Number.");
        } else {
            System.out.println(inputNumber + " is not a Perfect Number.");
        }
        inputScanner.close();
    }
    public static boolean checkPerfectNumber(int inputNumber) {
        int divisorSum = 0;
        for (int potentialDivisor = 1; potentialDivisor <= inputNumber / 2; potentialDivisor++) {
            if (inputNumber % potentialDivisor == 0) {
                divisorSum += potentialDivisor;
            }
        }
        return divisorSum == inputNumber;
    }
}
