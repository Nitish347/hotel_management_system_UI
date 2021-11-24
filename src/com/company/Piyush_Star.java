package com.company;
import java.util.Scanner;


public class Piyush_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int num1 = (num-2)/2;
        for (int i = 0; i <= num1; i++) {
            for (int j = 0; j <=num1-i;j++) {
                System.out.print(" ");

            }
            for (int k=1;k<=2*i+2;k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}

