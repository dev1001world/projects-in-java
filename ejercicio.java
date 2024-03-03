package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a,b,c,d;
    int mayor_num, menor_num;

    System.out.println("ingrese los valores de A,B,C,D");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    d = input.nextInt();

    if (a > b ){
        a = b;
    }
    if (c > d ){
        c = d;
    }
    if (a > c){
        a = c;
    }
    menor_num = a;

    if (a < b ){
        a = b;
    }
    if (c < d ){
        c = d;
    }
    if (a < c){
        a = c;
    }
    mayor_num = a;

    System.out.println("el numero menor es " + menor_num + " el numero mayor " + mayor_num);
    System.out.println("la multiplicacion de esos dos valores es "+ menor_num * mayor_num);
    }
}