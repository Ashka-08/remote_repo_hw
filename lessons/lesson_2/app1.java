import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class app1 {
    public static void main(String[] args) {
        //NullPointerException
        // String name = null;
        // System.out.println(name.length());

        // ClassCastException
        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file);

        // NumberFormatException
        // String number = "123fg";
        // int result = Integer.parseInt(number);
        // System.out.println(result);

        // The method emptyList() is undefined for the type
        // List<Object> emptyList = Collection.emptyList();
        // emptyList.add(new Object());

        // int number = 1;
        // try {
        //     number = 10 / 0;
        //     String test = null;
        //     System.out.println(test.length());
        // } catch (ArithmeticException e) {
        //     System.out.println("divide by zero not supported");
        // } catch (NullPointerException e) {
        //     System.out.println("NullPointerException");
        // } catch (Exception e) {
        //     System.out.println("exception");
        // }
        // System.out.println(number);

        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("cath exception: " +
                                e.getClass().getSimpleName());
            // System.out.println(e.getMessage());
            // System.out.println(e.getLocalizedMessage());
            // System.out.println(e.toString());
            // System.out.println(e);
            // System.out.println(e.getCause());
        } finally {
            if (test !=null) {
                try {
                    test.close();
                } catch (IOException e) {
                    // throw new RuntimeException(e);
                    System.out.println("exception while close");
                }
            }
        }
    }
}