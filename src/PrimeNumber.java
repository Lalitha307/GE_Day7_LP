import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputScanner.nextInt();
        if (checkPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
        inputScanner.close();
    }
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int potentialDivisor = 2; potentialDivisor <= Math.sqrt(number); potentialDivisor++) {
            if (number % potentialDivisor == 0) {
                return false;
            }
        }
        return true;
    }
}
