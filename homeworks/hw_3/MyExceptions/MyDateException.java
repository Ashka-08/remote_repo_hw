package homeworks.hw_3.MyExceptions;

public class MyDateException extends MyException {

    public MyDateException() {
    }

    @Override
    public String myExceptionDesc() {
        return ("Дата введена некорректно");
    }

}
