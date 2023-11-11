package service;

import file.CSVWriter;
import model.Employee;

import java.util.List;

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
        editEmployee(id, employee);
    }

    @Override
    public void fireEmployee(int id) {
        fireEmployee(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        //System.out.println("from staff service");
        return getAllEmployees();
    }

    @Override
    public List<Employee> getEmployeesById(int id) {
        return super.getEmployeesById(id);
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return super.getEmployeesByName(name);
    }

    @Override
    public List<Employee> getEmployeesByRole(String role) {
        return super.getEmployeesByRole(role);
    }
}
