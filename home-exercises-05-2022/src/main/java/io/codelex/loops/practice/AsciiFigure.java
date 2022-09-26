package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        int rows = 7;
        int charInOneLine = (rows - 1) * 8;
        for (int i = 0; i <= charInOneLine; i += 8) {
            for (int j = 1; j <= (charInOneLine - i) / 2; j++) {
                System.out.print("/");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int h = 1; h <= (charInOneLine - i) / 2; h++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
