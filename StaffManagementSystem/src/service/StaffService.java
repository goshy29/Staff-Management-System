package service;

import file.CSVReader;
import file.CSVUpdate;
import file.CSVWriter;
import model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class StaffService extends EmployeeService {
    private String file;

    public StaffService(String file) {
        this.file = file;
    }

    @Override
    public void addEmployee(Employee employee) {
        CSVWriter.write(file, employee);
    }

    @Override
    public void editEmployee(int id, Employee employee) {
        HashMap<Integer, Employee> map = getAllEmployees();
        map.put(id, employee);
        CSVUpdate.update(file, map);
    }

    @Override
    public void fireEmployee(int id) {
        fireEmployee(id);
    }

    @Override
    public HashMap<Integer, Employee> getAllEmployees() {
        return CSVReader.read(file);
    }

    @Override
    public void getEmployeesById(int id) {
        HashMap<Integer, Employee> map = getAllEmployees();
        if (map.containsKey(id)) {
            System.out.printf("%d. name: %s, department: %s, position: %s, salary: %.2f%n", map.get(id).getId(),
                    map.get(id).getName(), map.get(id).getDepartment(), map.get(id).getRole(), map.get(id).getSalary());

        } else {
            System.out.println("Invalid id. Record not found.");
        }
    }

    @Override
    public void getEmployeesByName(String name) {
        HashMap<Integer, Employee> map = getAllEmployees();
        for (HashMap.Entry<Integer, Employee> entry : map.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                System.out.printf("%d. name: %s, department: %s, position: %s, salary: %.2f%n", entry.getValue().getId(),
                        entry.getValue().getName(), entry.getValue().getDepartment(), entry.getValue().getRole(), entry.getValue().getSalary());
            }
        }
    }

    @Override
    public void getEmployeesByRole(String role) {
        HashMap<Integer, Employee> map = getAllEmployees();
        for (HashMap.Entry<Integer, Employee> entry : map.entrySet()) {
            if (entry.getValue().getRole().equals(role)) {
                System.out.printf("%d. name: %s, department: %s, position: %s, salary: %.2f%n", entry.getValue().getId(),
                        entry.getValue().getName(), entry.getValue().getDepartment(), entry.getValue().getRole(), entry.getValue().getSalary());
            }
        }
    }

    @Override
    public void getEmployeesByDepartment(String department) {
        HashMap<Integer, Employee> map = getAllEmployees();
        for (HashMap.Entry<Integer, Employee> entry : map.entrySet()) {
            if (entry.getValue().getDepartment().equals(department)) {
                System.out.printf("%d. name: %s, department: %s, position: %s, salary: %.2f%n", entry.getValue().getId(),
                        entry.getValue().getName(), entry.getValue().getDepartment(), entry.getValue().getRole(), entry.getValue().getSalary());
            }
        }
    }
}
