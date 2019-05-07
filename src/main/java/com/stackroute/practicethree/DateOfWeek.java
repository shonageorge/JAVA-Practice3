package com.stackroute.practicethree;


//3. Write a java program to calculate first and last date of a week.

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateOfWeek {
    public static void main(String[] args) {

       Calendar c = Calendar.getInstance();

       c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);          //setting the first day of week as monday

        SimpleDateFormat dateformat=new SimpleDateFormat("EEE dd/MM/y");            //displaying format
        System.out.println("First Date of Week : "+dateformat.format(c.getTime()));         //getting and printing the date and time of 1st day of week in specified format
        c.add(Calendar.DATE, 6);                                                    // adding 6 to the starting date to get last date of week
        System.out.println("Last Date of Week : "+dateformat.format(c.getTime()));          //getting and printing the date and time of last day of week in specified format
    }
}

