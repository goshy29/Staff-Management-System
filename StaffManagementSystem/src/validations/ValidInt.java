package validations;

import java.util.Scanner;

public class ValidInt {
    public static int validateIntegerInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;

        do {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input.");
                scanner.next();
            }
        } while (!validInput);

        return input;
    }
}
