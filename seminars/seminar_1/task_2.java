package seminar_1;

import java.util.Scanner;

/* Реализовать метод, принимающий целочесленный массив и некоторое значение.
 * Метод ищет в массиве заданное значение, возвращает его индекс.
 * Если длина массива меньше заданного минимума, метод вернет -1.
 * Если исходный элемент не найден, метод вернет -2 в качестве кода ошибки.
 * Если вместо массива пришел null, метод вернет -3.
 * Придумать свои варианты исключительных ситуаций и вернуть коды ошибок.
 * Напишите метод, в котором реализуйте взаимодействие в пользователем.
 * То есть этот метод запросит искомое число у пользователя, вызовет первый,
 * обработает возвращенное значение и покажет читаемый результат пользователю
 * Например, если вернулся -2, польз-лю выведется сообщение:
 * "Искомый элемент не найден"
 */
public class task_2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int[] array = null;

        printCodeExceptions(array(array, 2, 5)); // index = 1
        printCodeExceptions(array(null, 15, 15)); // arr=null
        printCodeExceptions(array(array, 15, 5)); //not found
        printCodeExceptions(array(array, 1, 15)); //size < min
        Scanner scanner = new Scanner(System.in, "Cp866");
        // View(array, scanner);
        scanner.close();
    }
    
    public static void View(int[] arr, Scanner sc){
        System.out.println("Введите число: ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt() ;
            int res = search(arr, a);
            if (res == -1) {
                System.out.println("длина массива меньше заданного минимума");
            } else if (res == -2) {
                System.out.println("Искомый элемент не найден");
            } else if (res == -3) {
                System.out.println("Массив не найден");
            } else {
                System.out.println("Идекс искомого элемента " + (res+1));
            }
        } else {
            System.out.println("Sorry, couldn't understand you!");
        }
    }

    private static int search(int[] arr, int n) {
        if (arr != null) {
                int minSize = 5;
            if (arr.length < minSize) {
                return -1;
            }
            int result = -2;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                    result = i;
                }
            }
            return result;
        } else {
            return -3;
        }
    }


    private static int array(int[] arr, int value, int min) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;
    }

    public static void printCodeExceptions(int code) {
        if (code == -3) {
            System.out.println("вместо массива пришел null");
        } else if (code == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (code == -1) {
            System.out.println("длина массива меньше заданного минимума");
        } else {
            System.out.println("Индекс" + code);
        }
    }
}