package app;

import manager.Manager;
import service.EmployeeService;
import service.StaffService;

import java.util.Scanner;

public class StaffManagementSystem {
    public static void main(String[] args) {
        String file = "C:\\Users\\G\\Desktop\\Sirma Java Course\\Staff-Management-System\\StaffManagementSystem\\Employee.csv";
        EmployeeService service = new StaffService(file);
        Manager manager = new Manager(service);
        System.out.println("Welcome to Staff Management System");
        displayCommands();
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while (isRunning) {
            int menuIndex = Integer.parseInt(sc.nextLine());
            manager.execute(menuIndex);

        }
    }
    private static void displayCommands() {
        System.out.println("1. Add Employee");
        System.out.println("2. Edit Employee");
        System.out.println("3. List of Employees");
        System.out.println("4. Search by Department");
        System.out.println("5. Search by Id");
        System.out.println("6. Fire Employee");
        System.out.println("7. Search by Name");
        System.out.println("8. Save & Exit");
    }
}
