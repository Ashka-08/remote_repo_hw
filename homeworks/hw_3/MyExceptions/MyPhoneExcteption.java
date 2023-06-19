package homeworks.hw_3.MyExceptions;

public class MyPhoneExcteption extends MyException {

    public MyPhoneExcteption() {
    }

    @Override
    public String myExceptionDesc() {
        return ("Номер телефона введен некорректно");
    }
}
