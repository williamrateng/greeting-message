import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        System.out.print("Enter your name: ");  // Prompt user to enter their name
        String name = scanner.nextLine();  // Read user input

        System.out.println("Hello, " + name + "! Welcome to Java programming.");  // Output user input in a greeting

        scanner.close();  // Close the scanner
    }
}
