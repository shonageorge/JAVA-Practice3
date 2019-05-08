package com.stackroute.practicethree;

//5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//        WWrepresents white color and BB represents Black color.

import java.util.Arrays;

public class ChessBoardPattern {

    public static void main(String[] args) {
        int i, j;
        String[][] chessArrayWB = new String[8][8];            //declaration of multidimensional array
        for (i = 0; i <= 7; i++) {
            if (i % 2 == 0) {                                     //loop for even number of rows
                for (j = 0; j < 7; j++) {                     //loop for printing white at even positions
                    chessArrayWB[i][j] = "WW|";
                    j++;
                }
                for (j = 1; j <= 7; j++) {                    //loop for printing black at odd positions
                    chessArrayWB[i][j] = "BB|";
                    j++;
                }
            } else {                                             //loop for even number of rows
                for (j = 0; j < 7; j++) {
                    chessArrayWB[i][j] = "BB|";
                    j++;
                }
                for (j = 1; j <= 7; j++) {
                    chessArrayWB[i][j] = "WW|";
                    j++;
                }
            }

        }
        for (i = 0; i <= 7; i++) {
            for (j = 0; j <= 7; j++) {
                System.out.print(chessArrayWB[i][j]);                //print array
            }
            System.out.println("");
        }

    }
}
