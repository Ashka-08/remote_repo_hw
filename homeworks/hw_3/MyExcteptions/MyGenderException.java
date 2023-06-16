package homeworks.hw_3.MyExcteptions;

public class MyGenderException extends Exception{

    public MyGenderException() {
    }

    public void myGenderExceptionDesc (String str) {
        System.out.println("Пол введен некорректно. Ошибка здесь: " + str);
    }
}
