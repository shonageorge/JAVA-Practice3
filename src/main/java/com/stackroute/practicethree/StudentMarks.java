package com.stackroute.practicethree;

//1. Create a class called StudentMarks, which prompts user for the number of students, reads it
//        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//        grades of each of the students and saves them in an int array called stuGrades. Your program shall
//        check that the grade is between 0 and 100 else has to trow an error message.

import java.util.Scanner;

public class StudentMarks {

    Scanner s = new Scanner(System.in);

    public int numOfStudents(){
        System.out.print("Enter the number of students");
        int numOfStudents = s.nextInt();                                   //reading number of students
        return numOfStudents;
    }

    public void studentsGrades(int numOfStudents){
        int[] stuGrades=new int[numOfStudents];
        int i;
        for (i=0;i<numOfStudents;i++){

            System.out.print("Grade of Student"+(i+1)+": ");               //reading grades of students
            stuGrades[i]=s.nextInt();

            try {
                if((stuGrades[i]>100)||(stuGrades[i]<0)){                  //checking if the grade is greater than 100 and less than 0
                    System.out.print("Error");                             //print error message
                }
            }catch (Exception e){}

            }
        }
    }


class StudentMarksGrade{


    public static void main(String[] args) {

        StudentMarks stdmarks=new StudentMarks();
        int numOfStudents=stdmarks.numOfStudents();
        stdmarks.studentsGrades(numOfStudents);
    }
}
