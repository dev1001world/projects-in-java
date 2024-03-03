package org.example;

public class Main {
    public static void main(String[] args) {

        int numeber_random = (int) (Math.random() * 10) + 1;

        int[][] matriz_of_objetc = new int[5][5];

        print_matriz(matriz_of_objetc, numeber_random);

    }
    public static void print_matriz (int[][] matriz_of_object, int number_random){

        for (int i = 0; i < matriz_of_object.length; i++){
            for (int j = 0; j < matriz_of_object.length; j++){
                matriz_of_object[i][j] = number_random;
                System.out.print(matriz_of_object[i][j]);
            }
            System.out.println('\n');
        }
    }
}