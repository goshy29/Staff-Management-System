package file;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static void read(String file) {
        List<Employee> employeeList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitValues = line.trim().split(", ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
