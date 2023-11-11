package service;

import model.Employee;

import java.util.List;

public class EmployeeService implements Service {
    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void editEmployee(int id, Employee employee) {

    }

    @Override
    public void fireEmployee(int id) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("from employee service");
        return null;
    }

    @Override
    public List<Employee> getEmployeesById(int id) {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByRole(String role) {
        return null;
    }
}
