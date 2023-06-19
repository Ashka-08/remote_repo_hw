package homeworks.hw_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import homeworks.hw_3.MyExceptions.MyDateException;
import homeworks.hw_3.MyExceptions.MyGenderException;
import homeworks.hw_3.MyExceptions.MyNameException;
import homeworks.hw_3.MyExceptions.MyPhoneExcteption;

public class Controller {
    public View view;
    public User user;

    public Controller() {
        this.view = new View();
    }

    public void start() {
        String data = view.input();
        if (readConsoleOk(data)) {
            User user = new User();
            arrayData(data, user);
            if (user.arayDataOk()) {
                File file = new File(user.getLastName()+".txt");
                try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write(user.toString());
                    view.output("Файл записан успешно"); 
                } catch (IOException e) {
                    view.output(e.getStackTrace().toString());
                }  
            } else {
                System.out.println("Юзер не спарсен");
            }
        } else {
            view.output("Ошибка контроллера");
        }
    }
    
    public Boolean readConsoleOk(String data) {
        int check = checkSize(data);
        view.checkInputData(check);
        if (check != 1) {
            return false;
        }
        return true;
    }

    public void arrayData(String data, User user) {
        try {
            user.setDataArrUser(user.parser(parseArray(data)));
            view.output("Результат работы парсера: ");
            view.output(user.toString());
        } catch (MyDateException e) {
            view.output(e.myExceptionDesc());
        } catch (MyGenderException e) {
            view.output(e.myExceptionDesc());
        } catch (MyNameException e) {
            view.output(e.myExceptionDesc());
        } catch (MyPhoneExcteption e) {
            view.output(e.myExceptionDesc());
        } catch (Exception e) {
            view.output(e.getLocalizedMessage());
        }
    }

    public String[] parseArray(String inputData) {
        return inputData.split(" ");
    }

    public int checkSize(String inputData) {
        String[] data = parseArray(inputData);
        if (data.length == 6) {
            return 1;
        } else if (data.length < 6) {
            return -1;
        } else {
            return -2;
        }
    }
}
