import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }
        
        System.out.println("\nComparison of first and last element:");
        if (numbers[0] == numbers[4]) {
            System.out.println(numbers[0] + " is equal to " + numbers[4]);
        } else if (numbers[0] > numbers[4]) {
            System.out.println(numbers[0] + " is greater than " + numbers[4]);
        } else {
            System.out.println(numbers[0] + " is less than " + numbers[4]);
        }
        
        sc.close();
    }
}
