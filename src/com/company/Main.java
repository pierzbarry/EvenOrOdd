package com.company;
import java.util.Scanner;

public class Main {

        public static void main(String args[]) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter number:");

            int num1 = keyboard.nextInt();

            for(int i = 1; i < num1; i++){
                System.out.println(i);
            }

            if(num1%2 == 0){
                System.out.println(num1 + " is even");
            }
            else if(num1%2 == 1)
                System.out.println(num1 + " is odd");
        }
}