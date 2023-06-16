package homeworks.hw_3;
/* Форматы данных:
* фамилия, имя, отчество - строки
* дата рождения - строка формата dd.mm.yyyy
* номер телефона - целое беззнаковое число без форматирования
* пол - символ латиницей f или m. */

import java.util.HashMap;

import homeworks.hw_3.MyExcteptions.MyDateException;
import homeworks.hw_3.MyExcteptions.MyGenderException;

public class User {
    public HashMap<String, Object> dataUser;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : dataUser.keySet()) {
            sb.append(dataUser.get(str));
            sb.append(" ");
        }
        return sb.toString();
    }
    public int checkSize(String inputData) {
        String[] data = parseArray(inputData);
        if (data.length == 6) {
            return 0;
        } else if (data.length < 6) {
            return -1;
        } else {
            return -2;
        }
    }

    private String[] parseArray(String inputData) {
        return inputData.split(" ");
    }

    public HashMap<String, Object> createUser(String inputData) {
        return parseData(parseArray(inputData));
    }

    private HashMap<String, Object> parseData(String[] data) {
        HashMap<String, Object> dataUser = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (String i : data) {
            
            if (i.length() == 1) {
                if (i.equalsIgnoreCase("f") || 
                    i.equalsIgnoreCase("m")) {
                    dataUser.put("Gender", i);
                } else {
                    try {
                        throw new MyGenderException();
                    } catch (MyGenderException e) {
                        e.myGenderExceptionDesc(i);
                    }
                }
            } else if (i.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = i.split("\\.");
                boolean flag = true;
                if (Integer.parseInt(arrayDate[0]) < 0 ||
                    Integer.parseInt(arrayDate[0]) > 31 || 
                    Integer.parseInt(arrayDate[1]) < 0 ||
                    Integer.parseInt(arrayDate[1]) > 12 || 
                    Integer.parseInt(arrayDate[2]) < 0 ||
                    Integer.parseInt(arrayDate[1]) > 2022) {
                    try {
                        throw new MyDateException();
                    } catch (MyDateException e) {
                        e.myDateExceptionDesc(i);
                    }
                } else {
                    if (Integer.parseInt(arrayDate[2]) % 4 == 0) {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 30) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }
                    } else {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[2]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 29) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }

                    }
                    if (!flag) {
                        dataUser.put("Date", i);
                    } else try {
                        throw new MyDateException();
                    } catch (MyDateException e) {
                        e.myDateExceptionDesc(i);
                    }
                }

            } else if (i.matches("[0-9]+")) {
                dataUser.put("tel", i);
            } else if (i.matches("[A-Za-z]+")) {
                sb.append(i + " ");
            } else {
                try {
                    throw new MyDateException();
                } catch (MyDateException e) {
                    e.myDateExceptionDesc(i);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataUser.put("firstName", fullName[1]);
            dataUser.put("lastName", fullName[0]);
            dataUser.put("middleName", fullName[2]);
        }
        
        return dataUser;
    }
    
}
