package homeworks.hw_3.MyExcteptions;

public class MyDateException extends Exception {

    public MyDateException() {
    }

    public void myDateExceptionDesc(String str) {
        System.out.println("Дата введена некорректно. Ошибка здесь: " + str);
    }
}
