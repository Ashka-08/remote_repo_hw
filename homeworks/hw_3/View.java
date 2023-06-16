package homeworks.hw_3;

import java.util.Scanner;

public class View {
    
    public String input() {
        System.out.println("""
            Введите следующие данные в произвольном порядке, разделенные пробелом:
            Фамилия Имя Отчество дата_рождения номер_телефона пол""");
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            String data = iScanner.nextLine();
            return data;
        }
    }
}
