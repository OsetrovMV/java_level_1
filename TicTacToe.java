/**
 * Java 1. Lesson 4.
 *
 * @author Mikhail Osetrov
 * @version 16.12.2021 - 20.12.2021
 */

import java.util.Scanner;
import java.util.Random;

class TicTacToe {

    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][]table;
    Scanner sc;
    Random random;

    public static void main(String[]args) {
        TicTacToe ttt = new TicTacToe();
        ttt.game();
    }

    TicTacToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("You Won");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw...");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("Ai Won");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw...");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x,
        y;
        do {
            System.out.print("Enter x y [1...3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean isWin(char ch) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if ((table[y][0] == ch && table[y][1] == ch && table[y][2] == ch) || (table[0][x] == ch && table[1][x] == ch && table[2][x] == ch))
                return true;
            }
        }
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
