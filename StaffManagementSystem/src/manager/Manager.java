package manager;

import model.Employee;
import service.EmployeeService;
import validations.ValidDouble;
import validations.ValidInt;
import validations.ValidString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class Manager {
    private EmployeeService service;

    public Manager(EmployeeService service) {
        this.service = service;
    }

    public int execute(int menuIndex) {
        if (menuIndex == 1) {
            HashMap<Integer, Employee> map = service.getAllEmployees();
            int id = ValidInt.validateIntegerInput("Enter id: ");
            if (map.containsKey(id)) {
                System.out.printf("Id %s already exist!", id);
            } else {
                String name = ValidString.validateStringInput("Enter name: ");

                LocalDateTime now = LocalDateTime.now();
                String startDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                String department = ValidString.validateStringInput("Enter department: ");
                String role = ValidString.validateStringInput("Enter role: ");
                double salary = ValidDouble.validateDoubleInput("Enter salary: ");
                Employee employee = new Employee(id, name, startDate,
                        Optional.empty(), department, role, salary);
                service.addEmployee(employee);
            }
            menuIndex = backMenu();
        }
        if (menuIndex == 2) {
            HashMap<Integer, Employee> map = service.getAllEmployees();
            int keyToUpdate = ValidInt.validateIntegerInput("Enter id to update: ");
            if (map.containsKey(keyToUpdate)) {
                String name = ValidString.validateStringInput("Enter name: ");

                LocalDateTime now = LocalDateTime.now();
                String startDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                String department = ValidString.validateStringInput("Enter department: ");
                String role = ValidString.validateStringInput("Enter role: ");
                double salary = ValidDouble.validateDoubleInput("Enter salary: ");
                Employee updatedEmployee = new Employee(keyToUpdate, name, startDate,
                        Optional.empty(), department, role, salary);
                service.editEmployee(keyToUpdate, updatedEmployee);
            } else {
                System.out.println("Invalid key. Record not found.");
            }
            menuIndex = backMenu();
        }
        if (menuIndex == 3) {
            HashMap<Integer, Employee> map = service.getAllEmployees();
            for (HashMap.Entry<Integer, Employee> entry : map.entrySet()) {
                System.out.printf("%d. name: %s, department: %s, position: %s, salary: %.2f%n", entry.getValue().getId(),
                        entry.getValue().getName(), entry.getValue().getDepartment(), entry.getValue().getRole(), entry.getValue().getSalary());
            }
            menuIndex = backMenu();
        }
        if (menuIndex == 4) {
            String role = ValidString.validateStringInput("Enter role: ");
            service.getEmployeesByRole(role);
            menuIndex = backMenu();
        }
        if (menuIndex == 5) {
            int id = ValidInt.validateIntegerInput("Enter id: ");
            service.getEmployeesById(id);
            menuIndex = backMenu();
        }

        if (menuIndex == 7) {
            String name = ValidString.validateStringInput("Enter full name: ");
            service.getEmployeesByName(name);
            menuIndex = backMenu();
        }
        if (menuIndex == 8) {
            String department = ValidString.validateStringInput("Enter department: ");
            service.getEmployeesByDepartment(department);
            menuIndex = backMenu();
        }
        return menuIndex;
    }

    private static int backMenu() {
        System.out.println("8. Back");
        System.out.println("9. Exit");
        Scanner sc = new Scanner(System.in);
        int menuIndex = Integer.parseInt(sc.nextLine());
        return menuIndex;
    }
}
