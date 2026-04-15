import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        System.out.println("Enter age and height for 3 friends:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " - Age: ");
            ages[i] = sc.nextInt();
            System.out.print(names[i] + " - Height: ");
            heights[i] = sc.nextInt();
        }
        
        int youngestIndex = 0, tallestIndex = 0;
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");
        
        sc.close();
    }
}
