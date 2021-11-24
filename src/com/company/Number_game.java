package com.company;

import java.util.Random;
import java.util.Scanner;

public class Number_game {
    public static void main(String[] args) {
        int easy =25,medium=50,hard=100,number = 0,guess_time=1;
        Scanner input = new Scanner(System.in);
        System.out.println("easy:1 medium:2 hard:3");
        int n=input.nextInt();
        if (n==1){
            number = easy;
        }
        if (n==2){
            number = medium;
        }
        if (n==3){
            number = hard;
        }
        Random random_number = new Random();
        int num = random_number.nextInt(number);
        System.out.println(num);
        while(true){
            System.out.println("Guess a number ");
            int user_input = input.nextInt();
            if (user_input<num){
                System.out.println("Number is too low ");
                guess_time++;
            }
            if(user_input>num){
                System.out.println("Number is too high");
                guess_time++;
            }
            if (user_input==num){
                System.out.println("You win ");
                System.out.println(guess_time);
                break;
            }
        }
    }
}
