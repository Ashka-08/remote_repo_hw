package homeworks.hw_3;

import java.util.ArrayList;
import java.util.List;

import homeworks.hw_3.MyExceptions.MyDateException;
import homeworks.hw_3.MyExceptions.MyGenderException;
import homeworks.hw_3.MyExceptions.MyLanguageException;
import homeworks.hw_3.MyExceptions.MyNameException;
import homeworks.hw_3.MyExceptions.MyPhoneExcteption;

import java.text.SimpleDateFormat;

public class User {
    public List<String> dataArrUser;

    public User(List<String> dataArrUser) {
        this.dataArrUser = dataArrUser;
    }

    public User() {
        this.dataArrUser = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String string : dataArrUser) {
            sb.append(string + " ");
        }
        sb.append("\n");
        return sb.toString();
    }

    public List<String> parser(String[] data) 
            throws MyDateException, MyGenderException, MyNameException, 
            MyPhoneExcteption, MyLanguageException {

        List<String> dataArrUser = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {

            if (i >= 0 && i < 3) {
                if (data[i].matches("[а-яёА-ЯЁ]+")) {
                    dataArrUser.add(data[i]);
                } else if (data[i].matches("[A-Za-z]+")) {
                    throw new MyLanguageException();
                } else {
                    throw new MyNameException();
                }
            }
            
            if (i == 3) {
                try {
                    SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
                    dataArrUser.add(date.format(date.parse(data[i])).toString());
                } catch (Exception e) {
                    throw new MyDateException();
                }
            } 
            if (i == 4) {
                try {
                    if (data[i].length() !=11) {
                        throw new MyPhoneExcteption();
                    }
                    dataArrUser.add(String.valueOf(Long.parseLong(data[i])));
                } catch (Exception e) {
                    throw new MyPhoneExcteption();
                }
            }
            if (i == 5) {
                try {
                    if (data[i].equalsIgnoreCase("f") || 
                        data[i].equalsIgnoreCase("m")) {
                        dataArrUser.add(data[i]);
                    } 
                } catch (Exception e) {
                    throw new MyGenderException();
                }
            }
        }
        if (dataArrUser.size() < 6) {
            throw new RuntimeException("Где-то закралась ошибка при парсинге данных");
        }
        return dataArrUser;
    }

    public List<String> getDataArrUser() {
        return dataArrUser;
    }

    public void setDataArrUser(List<String> dataArrUser) {
        this.dataArrUser = dataArrUser;
    }

    public String getLastName() {
        if (arayDataOk()) {
            return dataArrUser.get(0);
        }
        return "not LastName";
        
    }

    public Boolean arayDataOk() {
        if (dataArrUser.size() != 0) {
            return true;
        } else {
            return false;
        }
    }
}
