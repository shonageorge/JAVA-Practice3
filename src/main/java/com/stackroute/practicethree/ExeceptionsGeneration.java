package com.stackroute.practicethree;

//8. Write a program that will generate exceptions of type NegativeArraySizeException,
//        IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//        displaying the message stored in the exception object.

import java.util.Scanner;

public class ExeceptionsGeneration {

    public static void main(String[] args) throws Exception {

        int[] array = new int[5];
        String name = "";
        int length = name.length();
        //int index=array.indexOf("");


        System.out.println(name);



        try {                                                                   //For NullPointerException

            if (length == 0)
               throw new NullPointerException();

        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception caught");                //NullPointerException caught
        }

        try {                                                                   //for ArrayIndexOutOfBoundsException
            int i=array[6];
            System.out.println(i);
            throw new ArrayIndexOutOfBoundsException();

          }catch(ArrayIndexOutOfBoundsException e){                              //ArrayIndexOutOfBoundsException caught
            System.out.println("Array Out of Bound");

        }
        try{                                                                     //for   NegativeArraySizeException
            int[] arraynegative=new int[-5];
            throw new NegativeArraySizeException();

        }catch (NegativeArraySizeException e){                                  //NegativeArraySizeException caught
            System.out.println("Negative Size Array Exception");
        }

    }
}