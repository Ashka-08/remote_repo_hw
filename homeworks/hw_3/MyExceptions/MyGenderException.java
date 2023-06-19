package homeworks.hw_3.MyExceptions;

public class MyGenderException extends MyException {

    public MyGenderException() {
    }

    @Override
    public String myExceptionDesc() {
        return ("Пол введен некорректно");
    }
}
