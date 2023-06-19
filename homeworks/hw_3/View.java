package homeworks.hw_3;

import java.util.Scanner;

public class View {
    
    public String input() {
        System.out.println("""
            Введите следующие данные через пробел:
            Фамилия Имя Отчество 
            дата_рождения (в формате ДД.ММ.ГГГГ)
            номер_телефона (11-значное число без форматирования)
            пол (f или m)""");
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            String data = iScanner.nextLine();
            return data;
        }
    }

    public void output(String str) {
        System.out.println(str);
    }

    public void checkInputData(int check) {
        if (check == -1) {
            System.out.println("Введено меньше данных, чем требуется");
        } else 
        if (check == -2) {
            System.out.println("Введено больше данных, чем требуется");
        } else 
        if (check == 1) {
            System.out.println("Введено нужное количество данных, запуск парсера");
        }
    }
}
