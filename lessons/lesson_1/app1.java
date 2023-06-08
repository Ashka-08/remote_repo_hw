package lesson_1;

import java.io.File;

public class app1 {

    public static void main(String[] args) {
        System.out.println(getFileSize(new File("README.md")));
        System.out.println(getFileSize(new File("123")));
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Divide by zero not permited");
        }
        return a1/a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
