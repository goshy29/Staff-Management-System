package service;

import model.Employee;

import java.util.List;

public interface Service {
    void addEmployee(Employee employee);
    void editEmployee(int id, Employee employee);
    void fireEmployee(int id);
    List<Employee> getAllEmployees();
    List<Employee> getEmployeesById(int id);
    List<Employee> getEmployeesByName(String name);
    List<Employee> getEmployeesByRole(String role);
}
