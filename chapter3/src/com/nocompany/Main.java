package com.nocompany;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int guessNumber;
        int difference;

        Random random = new Random();
        int number = random.nextInt(100) + 1;
	    Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        guessNumber = in.nextInt();

        if(guessNumber == number){
            System.out.println("I have got it absolutely right, my thought number was : " + guessNumber);
        } else {
            difference = Math.abs(guessNumber - number);
            System.out.println("The number I was thinking of is: " + number + " You were off by: " + difference);
        }
    }
}
