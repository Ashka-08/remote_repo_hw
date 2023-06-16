package lesson_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class app1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("s2_t3.txt");
            FileWriter writer = new FileWriter("l3.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }   
        } catch (RuntimeException | IOException e) {
            System.out.println("cath exception: " +
                                e.getClass().getSimpleName());
        } 
        System.out.println("Copy successfully");
    }
}
