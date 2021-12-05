/**
 * Java_1.Homework_4
 *
 * @author natalichenkova
 * @version 05.12.21
 */
import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_O = '0';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("You win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println(" AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry,DRAW!");
                break;
            }

        }
        System.out.println("GAME OVER!");
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }

        }

    }

    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }

    }

    void turnHuman() {
        int x,y;
        do {
            System.out.print("Enter X and Y [1...3]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(! isCellValid(x,y));
        table [x][y] = SIGN_X;
    }

    void turnAI() {
        int x,y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while(! isCellValid(x,y));
        table [x][y] = SIGN_O;
    }

    boolean checkWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if (table[0][i] == ch && table[1][i] == ch && table [2][i] == ch) return true;
            if (table[i][0] == ch && table[i][1] == ch && table [i][2] == ch) return true;
        }


        if (table[0][0] == ch && table[1][1] == ch && table [2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table [0][2] == ch) return true;

        return false;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }

            }

        }
        return true;
    }

}
