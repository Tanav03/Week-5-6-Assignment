import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int digitCount = String.valueOf(Math.abs(number)).length();
        int[] digits = new int[digitCount];
        int temp = Math.abs(number);
        int index = 0;
        
        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }
        
        System.out.println("\nReversed number:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        
        sc.close();
    }
}
