package file;

import model.Employee;

import java.io.*;
import java.util.HashMap;
import java.util.Optional;

public class CSVReader {
    public static HashMap<Integer, Employee> read(String file) {
        HashMap<Integer, Employee> employeeList = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitValues = line.trim().split(",");
                employeeList.put(Integer.parseInt(splitValues[0]),
                        new Employee(Integer.parseInt(splitValues[0]), splitValues[1], splitValues[2], Optional.ofNullable(splitValues[3]),
                                splitValues[4], splitValues[5], Double.parseDouble(splitValues[6])));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;

    }
}
