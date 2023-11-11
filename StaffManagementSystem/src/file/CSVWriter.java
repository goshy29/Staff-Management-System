package file;


import model.Employee;

import java.io.*;
import java.util.Optional;

public class CSVWriter {
    public static void write(String file, Employee employee) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String line;
            writer.write(employee.getId() +","+ employee.getName() +","+ employee.getStartDate() +","+ null
                    +","+ employee.getDepartment() +","+ employee.getRole() +","+ employee.getSalary() +"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
