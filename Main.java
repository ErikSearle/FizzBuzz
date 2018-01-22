package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Take in input
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        //Generate and print out sequence
        FizzBuzzSequence fizzBuzz = new FizzBuzzSequence(input);
        System.out.println(fizzBuzz);
    }
}
