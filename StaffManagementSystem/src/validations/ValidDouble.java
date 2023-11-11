package validations;

import java.util.Scanner;

public class ValidDouble {
    public static double validateDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        double input = 0.00;
        boolean validInput = false;

        do {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input.");
            }
        } while (!validInput);

        return input;
    }
}
