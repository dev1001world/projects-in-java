package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        int x;
        int z;

        int number_one;
        int number_two;
        int number_three;

        System.out.println("escribe el valor number one");
        number_one = input.nextInt();

        System.out.println("escribe el valor number two");
        number_two = input.nextInt();

        System.out.println("escribe el valor number three");
        number_three = input.nextInt();

        x = number_one;

        if (number_two > number_three) {
            z = number_two;
        }
        else {
            z = number_three;
        }

        if (x < z){
            x = z;
        }

        System.out.println("el numero mayor es:" + x);
    }
}