package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("ingresa un numero");
        number = input.nextInt();

        if(number % 2 == 0 ){
            System.out.println("si es par");
        }
        else{
            System.out.println("no es par");
        }
    }
}