package seminar_3.task_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class task_3 {
    public static void main(String[] args) 
    throws DivByZeroExcteption, NullValueArrayExcteption, 
    FileNotExistException, IOException {
        
        /* Задание 3.1. Ошибка при делении на 0 */

        // int a = 10;
        // int b = 0;
        // if (b!= 0) {
        //     System.out.println(a/b);
        // } else {
        //     throw new DivByZeroExcteption("Делить на 0 нельзя!");
        // }

        /* Задание 3.2. Ошибка при обращении к пустому элементу в массиве*/

        // Integer[] array = new Integer[] {0, 1, 2, 3, null};
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] != null) {
        //         System.out.println(array[i]);
        //     } else {
        //         throw new NullValueArrayExcteption(
        //                 "Элемент в массиве пустой, индекс " + i);
        //     }
        // }

        /* Задание 3.3. Ошибка при попытке открыть несуществующий файл*/
        // File file = new File("s2_t3_backup.txt");
        File file = new File("test");
        if (file.exists()) {
            FileReader reader = new FileReader(file);
            reader.read();
            System.out.println("Файл прочитан");
            reader.close(); 
        } else {
            throw new FileNotExistException("Файл не существует!");
        }
    }
}
