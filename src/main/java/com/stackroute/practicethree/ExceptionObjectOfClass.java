package com.stackroute.practicethree;

//7. Create a class with a main( ) that throws an object of class Exception inside a try block.
//        a. Give the constructor for Exception a String argument.
//        b. Catch the exception inside a catch clause and print the String argument.
//        c. Add a finally clause and print a message to prove you were there.


public class ExceptionObjectOfClass {
    String name;

    ExceptionObjectOfClass(String name){
      this.name=name;

    }

    public static void main(String[] args)throws Exception {
        ExceptionObjectOfClass obj=new ExceptionObjectOfClass("");       //object creation and constructor call
        try {

            int length=obj.name.length();
            if(length<=0){                                                         //checking if the length of string null
                throw new NullPointerException(obj.name);                          //throws null pointer Exception
            }
        }catch(NullPointerException e) {                                           //catch exception

            System.out.println("Null pointer Exception");
            System.out.println(obj.name);
        }

        finally
        {
            System.out.println("Exception Occured");
        }
    }
}
