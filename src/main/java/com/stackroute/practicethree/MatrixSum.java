package com.stackroute.practicethree;

//2. Write a program to compute the addition of two matrix, Read the number of rows and columns
//        as input, also the values of each matrix

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {

    Scanner scanner = new Scanner(System.in);

    public void rowColumnNumber() {
        System.out.print("Input number of rows of matrix : ");
        int rowNum = scanner.nextInt();                                                   //reading number of rows
        System.out.print("Input number of columns of matrix : ");
        int colNum = scanner.nextInt();                                                   //reading number of columns
        readMatrix(rowNum, colNum);

    }

    public void readMatrix(int rowNum, int colNum) {
        int i, j;
        int[][] arrayMatrix1 = new int[rowNum][colNum];                            //declaring multidimensional array
        int[][] arrayMatrix2 = new int[rowNum][colNum];

        System.out.print("Input elements of first matrix : ");                    //reading 1st matrix
        for (i = 0; i < rowNum; i++) {
            for (j = 0; j < colNum; j++) {
                arrayMatrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Input elements of second matrix : ");                      //reading 2nd matrix
        for (i = 0; i < rowNum; i++) {
            for (j = 0; j < colNum; j++) {
                arrayMatrix2[i][j] = scanner.nextInt();
            }
        }

        sumOfMatrix(rowNum, colNum, arrayMatrix1, arrayMatrix2);
    }

    public void sumOfMatrix(int rowNum, int colNum, int[][] arrayMatrix1, int[][] arrayMatrix2) {
        int i, j;
        int[][] sumArray = new int[rowNum][colNum];
        for (i = 0; i < rowNum; i++) {
            for (j = 0; j < colNum; j++) {
                sumArray[i][j] = arrayMatrix1[i][j] + arrayMatrix2[i][j];               //finding sum of two matrix
            }
        }

        System.out.println(Arrays.deepToString(sumArray));                 //display matrix

    }


    public static void main(String[] args) {

        MatrixSum matrixSum = new MatrixSum();                                             //object creation

        matrixSum.rowColumnNumber();
    }

}
