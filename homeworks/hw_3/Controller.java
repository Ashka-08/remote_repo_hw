package homeworks.hw_3;


public class Controller {
    
    public void start(View view) {
        String data = view.input();
        User user = new User();
        int check = user.checkSize(data);

        if (check == 0) {
            user.createUser(data);
            view.output(user.toString());
        } else if (check == -1) {
            System.out.println("Введено меньше данных, чем требуется");
        } else if (check == -2) {
            System.out.println("Введено больше данных, чем требуется");
        }
    }
}
