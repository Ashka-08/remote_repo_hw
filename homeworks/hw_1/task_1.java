package homeworks.hw_1;

/* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен 
разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.

Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен 
частному элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. 

Важно: При выполнении метода единственное исключение, 
которое пользователь может увидеть - RuntimeException, т.е. ваше.*/

public class task_1 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] arr2 = new Integer[]{6, 7, 8, 9, 10};
        Integer[] arr3 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] arr4 = new Integer[]{6, 7, 8, 9, 0};
        
        Integer[] newArr = arrSubtraction(arr1, arr2); //ok
        // newArr = arrSubtraction(arr3, arr1); //RuntimeException: Длины массивов не равны
        // newArr = arrSubtraction(arr3, null); //RuntimeException: Первый массив пустой

        newArr = arrDivision(arr1, arr2); //ok
        // newArr = arrDivision(arr3, arr2); //RuntimeException: Длины массивов не равны
        // newArr = arrDivision(arr4, arr1); //RuntimeException: На ноль делить нельзя, проверьте индекс 4
        // newArr = arrDivision(arr4, null); //RuntimeException: Второй массив пустой
    }

    private static boolean checkArray(Integer[] ar1, Integer[] ar2) {
        if (ar1 == null) {
            throw new RuntimeException("Первый массив пустой");
        };
        if (ar2 == null) {
            throw new RuntimeException("Второй массив пустой");
        };
        if (ar1.length != ar2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        return true;
    }

    public static Integer[] arrSubtraction(Integer[] ar1, Integer[] ar2) {
        if (checkArray(ar1, ar2)) {
            Integer[] result = new Integer[ar1.length];
            for (int i = 0; i < ar1.length; i++) {
                    result[i] = ar2[i] - ar1[i];
            }
            return result;
        }
        return null;
    }

    public static Integer[] arrDivision(Integer[] ar1, Integer[] ar2) {
        checkArray(ar1, ar2);
        Integer[] result = new Integer[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
                if (ar1[i] != 0) {
                    result[i] = ar2[i] / ar1[i];
                } else {
                    throw new RuntimeException("На ноль делить нельзя, проверьте индекс " + i);
                }
                
        }
        return result;
    }
}
