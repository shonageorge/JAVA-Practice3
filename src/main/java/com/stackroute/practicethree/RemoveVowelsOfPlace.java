package com.stackroute.practicethree;

//4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//        words in console

import java.util.Arrays;
import java.util.Scanner;

public class RemoveVowelsOfPlace {

    Scanner scanner = new Scanner(System.in);

    public String[] getPlaces() {
        int i;
        System.out.print("Number of places you want to enter: ");
        int numberOfPlaces = scanner.nextInt();
        String[] placesArray = new String[numberOfPlaces];
        for (i = 0; i < numberOfPlaces; i++) {
            placesArray[i] = scanner.next();                                                  //reading the places
        }
        return placesArray;
    }

    public void vowelsRemove(String[] placesArray) {

        int i;
        String[] vowelsRemoveArray = new String[placesArray.length];
        for (i = 0; i < placesArray.length; i++) {
            vowelsRemoveArray[i] = placesArray[i].replaceAll("[aeiou]", "");       //replacing vowels

            System.out.println("Place Name without Vowels" + (i + 1) + " : " + vowelsRemoveArray[i]);   //printing array
        }

    }

    public static void main(String[] args) {
        RemoveVowelsOfPlace removeVowelsOfPlace = new RemoveVowelsOfPlace();
        removeVowelsOfPlace.vowelsRemove(removeVowelsOfPlace.getPlaces());
    }
}
