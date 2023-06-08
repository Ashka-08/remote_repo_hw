package seminar_1;
/* Реализовать метод, принимающий целочисленный массив.
 * Если длина меньшье некоего заданного минимума, 
 * то метод возвращает код -1. Если длина больше, 
 * то метод возвращает длину массива.
*/
public class task_1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arraySize(array));
    }
    public static int arraySize(int[] arr) {
        int min = 15;
        if (arr.length < min) {
            return -1;
        }
        return arr.length;
    }
}
