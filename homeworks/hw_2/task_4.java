package homeworks.hw_2;

import java.util.Scanner;

/* Разработайте программу, которая выбросит Exception, когда пользователь 
вводит пустую строку. Пользователю должно показаться сообщение, 
что пустые строки вводить нельзя */
public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str = sc.nextLine();
            if(str.isEmpty()) {
                throw new IllegalArgumentException("Пустые строки вводить нельзя");
            } else {
            System.out.println(str);
            }
        } finally {
            sc.close();
        }
    }
}
