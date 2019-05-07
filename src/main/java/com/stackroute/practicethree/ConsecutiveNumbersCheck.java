package com.stackroute.practicethree;

//6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//        assume the digits are a string and use split()

import java.util.Scanner;

public class ConsecutiveNumbersCheck {

    Scanner s=new Scanner(System.in);

    public void numberRead() {
        int i,j,count=0,con=1;
        System.out.print("Enter the number");
        String number =s.next();                                      //reading the input as string
        String[] stringArray=number.split(",");                 //splitting the string and storing it into string array
        int[] numberArray=new int[stringArray.length];

        for (i=0;i<stringArray.length;i++){
        numberArray[i]=Integer.parseInt(stringArray[i]);              //converting string array into integer array
        }

        for (i=0;i<stringArray.length;i++){
            for (j=i+1;j<stringArray.length;j++){
                if(numberArray[j]==numberArray[i]+1||numberArray[j]==numberArray[i]-1)    //checking if the next number is a consecutive number
                    count++;

                else
                    con = 0;

                i++;
            }
        }
        if(count*con==0)
            System.out.println("non consecutive");
        else
            System.out.println("consecutive");

    }

    public static void main(String[] args) {
      ConsecutiveNumbersCheck numcheck=new ConsecutiveNumbersCheck();          //object creation
        numcheck.numberRead();                                                 //method call
    }
}
