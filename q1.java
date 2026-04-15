import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int[] digits = new int[Math.abs(number)];
        int[] frequency = new int[10];
        int temp = Math.abs(number);
        int digitCount = 0;
        
        while (temp != 0) {
            int digit = temp % 10;
            digits[digitCount] = digit;
            frequency[digit]++;
            temp /= 10;
            digitCount++;
        }
        
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        
        sc.close();
    }
}
