package homeworks.hw_2;
/* Если необходимо, исправьте данный код:  
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */
public class task_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // добавили массив
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
    }
     
}
