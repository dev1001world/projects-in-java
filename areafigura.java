package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int z;

        int perimeter;
        int area;

        System.out.println("Escriba el valor del primer lado");
        x = input.nextInt();

        System.out.println("Escriba el valor del segundo lado");
        z = input.nextInt();

        if (x == z){
            perimeter = x * 4;
            area = x * z;
            System.out.println("es un cuadrado " + perimeter +
                                " es su perimetro " + area + " es su area");
        }else{
            perimeter = x * 2 + z * 2;
            area = x * z;
            System.out.println("es un rectangulo " + perimeter +
                    " es su perimetro " + area + " es su area");
        }
    }
}