package validations;

import java.util.Scanner;

public class ValidString {
    public static String validateStringInput(String message) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.print(message);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid input.");
            }
        } while (input.isEmpty());

        return input;
    }
}
