package seminar_1;
/* Реализовать метод, принимающий в качестве аргумента целочисленный массив. 
 * Необходимо посчитать и вернуть сумму элементов этого массива.
 * При этом накладываем на метод 2 ограничения:
 * метод может работать только с квадратными массивами 
 * (количество строк = количество столбцов)
 * и в каждой ячейке может лежать либо 0, либо 1
 * (бинарный массив)
 * Если нарушается одно из условий, метод должен бросить 
 * RuntimeException с сообщением об ошибке
*/
public class task_3 {
    public static void main(String[] args) {
        checkArray(new Integer[] {1, null, 3, null, 5});
        int[][] array = new int[][] {{2, 0, 0}, 
                                    {1, 1, 1},
                                    {1, 0, 1}};
        int[][] array1 = new int[][] {{1, 0, 0}, 
                                    {1, 1, 1},
                                    {1, 0, 1}};
        int[][] array2 = new int[][] {{1, 0, 0}, 
                                    {1, 1, 1},
                                    {1, 0, 1},
                                    {1, 0, 1}};
        System.out.println(sumBin(array)); // Массив не бинарный
        System.out.println(sumBin(array1)); // Массив не квадратный
        System.out.println(sumBin(array2)); // Массив не квадратный
    }

    public static int sumBin(int[][] arr) {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Массив не бинарный: i=" + i + " j=" + j);
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void checkArray(Integer[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                sb.append(i + ", ");
            }
        }
        if (sb != null) {
            throw new RuntimeException("Индексы ошибок: " + sb.toString());
        } else {
            System.out.println("Ошибок нет");
        }
    }
}
