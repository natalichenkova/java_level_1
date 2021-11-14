import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * Java_1.Homework_3
 *
 * @author natalichenkova
 * @version 11.0.13
 */

public class Homework_3 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(Arrays.toString(setArray()));
        System.out.println("Задание 2");
        System.out.println(Arrays.toString(setAnEmptyArray()));
        System.out.println("Задание 3");
        System.out.println(Arrays.toString(setAndModifitiAnArray()));
        System.out.println("Задание 4");
        createTable();
        System.out.println("Задание 5");
       System.out.println(Arrays.toString(takeTwoArguments(8, 21)));

    }

    public static int [] setArray() {
        int[] arr = {1, 1, 1, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        return arr;
    }

    public static int [] setAnEmptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    public static int [] setAndModifitiAnArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    public static void createTable() {
        int[][] arr = new int[32][32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 32; j++) {
                if (j + 1 == arr.length - i) {
                    System.out.print("1");
                } else if (i == j) {
                    System.out.print("1");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public  static int [] takeTwoArguments (int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
