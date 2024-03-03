package org.example;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number_one, number_two, minor, bigger;
        String pair_or_odd;

        System.out.println("que numeros queires que salgan impares (impar) o pares (par)?");
        pair_or_odd = input.next();

        System.out.println("ingrese 2 numeros para crear el rango");
        number_one = input.nextInt();
        number_two = input.nextInt();

        if (number_one < number_two){

            minor = number_one;
            bigger = number_two;

        }else{

            minor = number_one;
            bigger = number_two;

        }

        if (pair_or_odd.equals("impar") || pair_or_odd.equals("impares")){

            while (minor<bigger){

                minor++;

                if (minor % 2 == 1) {

                    System.out.println(minor);

                }

            }

        }
        else if (pair_or_odd.equals("par") || pair_or_odd.equals("pares")) {

            while (minor<bigger){

                minor++;

                if (minor % 2 == 0) {

                    System.out.println(minor);

                }

            }

        }


    }
}