package homeworks.hw_3;

public class Model {
    private Boolean checkSize(String inputData) {
        String[] data = inputData.split(" ");
        if (data.length == 6) {
            return true;
        } else if (data.length < 6) {
            System.out.println("Введено меньше данных, чем требуется");
            return false;
        } else {
            System.out.println("Введено больше данных, чем требуется");
            return false;
        }
    }
}
