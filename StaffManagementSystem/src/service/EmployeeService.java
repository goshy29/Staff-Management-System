package service;

import model.Employee;

import java.util.HashMap;

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
    public HashMap<Integer, Employee> getAllEmployees() {
        System.out.println("from employee service");
        return null;
    }

    @Override
    public void getEmployeesById(int id) {

    }

    @Override
    public void getEmployeesByName(String name) {

    }

    @Override
    public void getEmployeesByRole(String role) {

    }

    @Override
    public void getEmployeesByDepartment(String department) {

    }
}
