package seminar_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// import java.io.*;
// import java.sql.SQLOutput;

/*Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
(либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет 
пройти по структуре данных,nесли сохранено значение ?, заменить его 
на соответствующее число.Если на каком-то месте встречается символ,
отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?.*/

public class task_3 {
    public static void main(String[] args) {
        try{
            PrintFile(readFile("s2_t3.txt"), "s2_t3.txt");
        } catch (IOException e){
            e.printStackTrace(); // вывод ошибки через Стактрейс
        }
    }

    public static String[][] readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int Filesize = 0;
        String Checked = reader.readLine();
        while (Checked != null){
            Filesize ++;
            Checked = reader.readLine();
        }
        reader.close();
    
        reader = new BufferedReader(new FileReader(fileName));
        String[][] result = new String[Filesize][2];
        for (int i = 0; i < Filesize; i++) {
    
            String[] temp = reader.readLine().split("=");
            if(!temp[1].equals("?") ){
                try {
                    int a = Integer.parseInt(temp[1]);
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println(temp[0]);
                    System.out.println(temp[1]);
                }
    
            } else {
                temp[1] = String.valueOf(temp[0].length());
    
            }
    
    
            result[i][0] = temp[0];
            result[i][1] = temp[1];
    
    
        }
        reader.close();
        return result;
    }
    
    public static void PrintFile(String[][] arr, String FileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
    
        for (int i = 0; i < arr.length; i++) {
            StringBuilder temp = new StringBuilder(arr[i][0] + "=" + arr[i][1]+"\n");
            writer.write(temp.toString());
        }
        writer.close();
    
    }
}
