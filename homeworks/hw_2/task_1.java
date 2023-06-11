package homeworks.hw_2;

import java.util.Scanner;
/* 
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить 
к падению приложения, вместо этого, необходимо повторно запросить у пользователя 
ввод данных.
*/
public class task_1 {
    public static void main(String[] args) {
        System.out.println("Дробь: " + inputFloat());
    }

    public static Float inputFloat() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                try {
                    System.out.println("Введите дробное числа через точку");
                    String input = sc.nextLine();
                    return Float.parseFloat(input);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка, попробуйте еще раз");
                } 
            }    
        } finally {
            sc.close();
        }
        
    }
}
