import java.util.Scanner;

public class OopsBannerApp {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Using for loop to print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {

            // Print in the required format
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close scanner
        sc.close();
    }
}