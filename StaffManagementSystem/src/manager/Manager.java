package manager;

import model.Employee;
import service.EmployeeService;
import service.Service;
import validations.ValidDouble;
import validations.ValidInt;
import validations.ValidString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Manager {
    private EmployeeService service;

    public Manager(EmployeeService service) {
        this.service = service;
    }

    public void execute(int menuIndex) {
        if (menuIndex == 1) {
            int id = ValidInt.validateIntegerInput("Enter id: ");
            String name = ValidString.validateStringInput("Enter name: ");
            LocalDateTime startDate = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            String formattedDate = startDate.format(myFormatObj);
            String department = ValidString.validateStringInput("Enter department: ");
            String role = ValidString.validateStringInput("Enter role: ");
            double salary = ValidDouble.validateDoubleInput("Enter salary: ");
            Employee employee = new Employee(id, name, startDate,
                    null, department, role, salary);
            service.addEmployee(employee);
        }
        if (menuIndex == 2) {

        }
    }
}
