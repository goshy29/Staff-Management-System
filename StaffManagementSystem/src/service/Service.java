package service;

import model.Employee;

import java.util.HashMap;
import java.util.List;

public interface Service {
    void addEmployee(Employee employee);
    void editEmployee(int id, Employee employee);
    void fireEmployee(int id);
    HashMap<Integer, Employee> getAllEmployees();
    void getEmployeesById(int id);
    void getEmployeesByName(String name);
    void getEmployeesByRole(String role);
    void getEmployeesByDepartment(String department);
}
