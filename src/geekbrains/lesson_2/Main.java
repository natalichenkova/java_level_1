package geekbrains.lesson_2;

/**
 * Java_1.Homework_2.
 *
 * @author natatalichenkova
 * @version 13
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(within10and20(5, 5));
        System.out.println(within10and20(7, 15));
        System.out.println(within10and20(3, 3));
        isPositivOrNegativ(5);
        isPositivOrNegativ(-8);
        System.out.println(isPositiv(8));
        System.out.println(isPositiv(-5));
        printWordNTimes("test",4);

    }

    public static boolean within10and20 (int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositivOrNegativ (int a) {
        if ( a >= 0) {
            System.out.println("Is Positiv");
        } else {
            System.out.println(" Is Negativ");
        }
    }

    public static boolean isPositiv (int a ) {
        if ( a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes (String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

}






