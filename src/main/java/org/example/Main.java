package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        game();
    }

    public static void game(){
        char [][] base = new char[3][3];
        boolean p1Turn;
        System.out.println("Game Start");
        printArrray(base);
        do {
            System.out.println("1st Player Turn");
            p1Turn=true;
            insert(base, p1Turn);
            printArrray(base);

            System.out.println("--------------------------------------------------\n\n");

            System.out.println("2nd Player Turn");
            p1Turn = false;
            insert(base, p1Turn);
            printArrray(base);

            System.out.println("--------------------------------------------------\n\n");
        }while (1!=0);
    }

    private static void insert(char[][] base, boolean p1Turn){
        if (p1Turn){
            Scanner sc = new Scanner(System.in);

            System.out.println("Select the position to mark");

            System.out.println("Select the row");
            int row = sc.nextInt();

            System.out.println("Select the column");
            int column = sc.nextInt();

            base[row-1][column-1] = 'X';
        }else{
            Scanner sc = new Scanner(System.in);

            System.out.println("Select the position to mark");

            System.out.println("Select the row");
            int row = sc.nextInt();

            System.out.println("Select the column");
            int column = sc.nextInt();

            base[row-1][column-1] = 'O';
        }
    }



    private static void printArrray(char[][] base){
        for (char[] chars : base) {
            for (char aChar : chars) {
                System.out.print("|" + aChar + "|");
            }
            System.out.println();
        }
    }
}
