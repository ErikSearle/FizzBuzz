package com.company;

public class FizzBuzzSequence {

    private String[] set;

    public FizzBuzzSequence(int n){
        set = new String[n];
        generate();
    }

    private void generate() {
        for(int i=1; i<=set.length; i++){
            if(i%3 == 0 && i%5 == 0) set[i-1] = "Fizz Buzz";
            else if(i%3 == 0) set[i-1] = "Fizz";
            else if(i%5 == 0) set[i-1] = "Buzz";
            else set[i-1] = Integer.toString(i);
        }
    }

    public String toString(){
        String returnable = "";
        for(int i=0; i<set.length; i++){
            returnable += set[i];
            if(i<set.length-1) returnable += ", ";
        }
        return returnable;
    }
}
