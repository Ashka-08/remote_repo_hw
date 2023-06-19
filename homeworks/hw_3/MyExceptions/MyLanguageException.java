package homeworks.hw_3.MyExceptions;

public class MyLanguageException extends MyException {

    public MyLanguageException() {
    }

    @Override
    public String myExceptionDesc() {
        return "Проверьте язык ввода ФИО";
    }
    
}
