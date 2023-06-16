package homeworks.hw_3;

public class Application {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller();
        controller.start(view);
    }
}
