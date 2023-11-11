package file;

import model.Employee;

import java.io.*;
import java.util.HashMap;

public class CSVUpdate {
    public static void update(String file, HashMap<Integer, Employee> map) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            String line;
            for (HashMap.Entry<Integer, Employee> entry : map.entrySet()) {
                writer.write(entry.getValue().getId() +","+ entry.getValue().getName() +","+ entry.getValue().getStartDate() +","+ null
                        +","+ entry.getValue().getDepartment() +","+ entry.getValue().getRole() +","+ entry.getValue().getSalary() +"\n");
            }
//            writer.write(map.keySet(). +","+ employee.getName() +","+ employee.getStartDate() +","+ null
//                    +","+ employee.getDepartment() +","+ employee.getRole() +","+ employee.getSalary() +"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
