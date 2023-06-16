package seminar_3.task_4;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"0", "0", "0", "0"}, 
                            {"1", "1", "1", "1"},
                            {"1", "1", "1", "1"},
                            {"1", "1", "1", "1"}};
        try {
            System.out.println(sumArray(array));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 && arr.length != arr[0].length) {
            throw new MyArraySizeException("Массив не размером 4х4!");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j].matches("\\d+")) {
                    int element = Integer.parseInt(arr[i][j]);
                    sum += element;
                } else {
                    throw new MyArrayDataException("Не удалось преобразовать в int элемент с индексом: [" 
                                                    + i + ", " + j + "]");
                }
                
            }
        }
        return sum;
    }
}
