package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 110; i++) {
            if(count % 11 == 0) {
                System.out.println();
            }
            if(i % 3 == 0 & i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 3 == 0 ) {
                System.out.print("Coza ");
            } else {
                System.out.print(i+" ");
            }
            count++;
        }
    }
}
