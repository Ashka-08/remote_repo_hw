package seminar_3;
/* Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвал метод doSomething(). */

public class task_1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
    public static void doSomething() throws RuntimeException {
        System.out.println("Метод doSomething()");
    }
}
