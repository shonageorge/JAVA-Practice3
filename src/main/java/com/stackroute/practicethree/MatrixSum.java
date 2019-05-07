package com.stackroute.practicethree;

//2. Write a program to compute the addition of two matrix, Read the number of rows and columns
//        as input, also the values of each matrix

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {

    Scanner s=new Scanner(System.in);

    public  void rowColumnNumber(){
        System.out.print("Input number of rows of matrix : ");
        int rownum=s.nextInt();                                                   //reading number of rows
        System.out.print("Input number of columns of matrix : ");
        int colnum=s.nextInt();                                                   //reading number of columns
        readMatrix(rownum,colnum);

    }

    public  void readMatrix (int rownum,int colnum){
        int i,j;
        int[][] arrayMatrix1=new int[rownum][colnum];                            //declaring multidimensional array
        int[][] arrayMatrix2=new int[rownum][colnum];

        System.out.print("Input elements of first matrix : ");                    //reading 1st matrix
        for (i=0;i<rownum;i++){
            for (j=0;j<colnum;j++){
                arrayMatrix1[i][j]=s.nextInt();
            }
        }

        System.out.print("Input elements of second matrix : ");                      //reading 2nd matrix
        for (i=0;i<rownum;i++){
            for (j=0;j<colnum;j++){
                arrayMatrix2[i][j]=s.nextInt();
            }
        }

        sumOfMatrix(rownum,colnum,arrayMatrix1,arrayMatrix2);
    }

    public  void sumOfMatrix(int rownum,int colnum,int[][] arrayMatrix1,int[][] arrayMatrix2) {
        int i,j;
        int[][] sumArray=new int[rownum][colnum];
        for (i=0;i<rownum;i++){
            for (j=0;j<colnum;j++){
                sumArray[i][j]=arrayMatrix1[i][j]+arrayMatrix2[i][j];               //finding sum of two matrix
            }
        }

                System.out.println(Arrays.deepToString(sumArray));                 //display matrix

    }


    public static void main(String[] args) {

        MatrixSum matrix=new MatrixSum();                                             //object creation

        matrix.rowColumnNumber();
    }

}
