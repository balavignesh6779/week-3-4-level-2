import java.util.Scanner;

public class OopsBannerApp {
    public static void main(String[] args) {

        // Create Scanner object to get input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } 
        else {

            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } 
                else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        // Close scanner
        sc.close();
    }
}