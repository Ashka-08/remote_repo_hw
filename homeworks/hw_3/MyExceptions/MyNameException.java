package homeworks.hw_3.MyExceptions;

public class MyNameException extends MyException {

    public MyNameException() {
    }

    @Override
    public String myExceptionDesc() {
        return "ФИО введены некорректно";
    }

}
