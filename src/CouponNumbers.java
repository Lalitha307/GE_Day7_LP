//Program 5
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static int generateRandomNumber(int maxCoupons) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(maxCoupons) + 1;
    }
    public static int calculateTotalRandomNumbers(int maxCoupons) {
        HashSet<Integer> uniqueCoupons = new HashSet<>();
        int randomCount = 0;
        while (uniqueCoupons.size() < maxCoupons) {
            int newCoupon = generateRandomNumber(maxCoupons);
            uniqueCoupons.add(newCoupon);
            randomCount++;
        }
        return randomCount;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers (maxCoupons): ");
        int maxCoupons = inputScanner.nextInt();
        int randomCount = calculateTotalRandomNumbers(maxCoupons);
        System.out.println("Total random numbers needed to get all distinct coupons: " + randomCount);
        inputScanner.close();
    }
}