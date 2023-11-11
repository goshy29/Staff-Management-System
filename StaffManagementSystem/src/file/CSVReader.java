package file;

import java.io.*;
import java.util.ArrayList;

public class CSVReader {
    public static void read(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitRoomValues = line.trim().split(", ");
                System.out.printf("ROOM TYPE: %s; DESCRIPTION: %s; NUMBER OF GUESTS: %s%n",
                        splitRoomValues[0], splitRoomValues[1], splitRoomValues[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
