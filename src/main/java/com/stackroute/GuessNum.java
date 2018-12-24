
package com.stackroute;

public class GuessNum {
    public static String Guessnumber(int n){
        int guess= n;
        int number = 45;

        if(guess > number)
        {

            return "Number guessed is greater than the original number";
        }
        else if(guess < number)
        {
            return "Number guessed is less than the original number";
        }
        else

        {
            return "Number guessed matches the original number";

        }

    }
}
