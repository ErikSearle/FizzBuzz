package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Take in input
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        if(input < 1) System.out.println("Invalid Input: Input must be greater than 0");

        //Generate and print out sequence
        else{
            FizzBuzzSequence fizzBuzz = new FizzBuzzSequence(input);
            System.out.println(fizzBuzz);
        }
    }
}
