import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] salary = new int[10];
        int[] yearsOfService = new int[10];
        int[] bonus = new int[10];
        int[] newSalary = new int[10];
        int totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Employee " + (i + 1) + " - Salary: ");
                int sal = sc.nextInt();
                System.out.print("Employee " + (i + 1) + " - Years of service: ");
                int years = sc.nextInt();
                
                if (sal > 0 && years >= 0) {
                    salary[i] = sal;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter valid numbers.");
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = (salary[i] * 5) / 100;
            } else if (yearsOfService[i] < 5) {
                bonus[i] = (salary[i] * 2) / 100;
            } else {
                bonus[i] = 0;
            }
            
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salary[i] + ", Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        }
        
        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}
