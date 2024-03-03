package org.example;

public class Main {
    public static void main(String[] args) {

        char[][] matrix = new char[5][9];

        for (int i = 0; i < 5; i++){

            for (int j = 0; j < 9; j++){

                matrix[i][j] = '.';

                if(i+j > 8){

                        matrix[i][j] = '0';
                }
            }
        }

        for (int i = 0; i < 5; i++){

            for (int j = 0; j < 9; j++){

                System.out.print(matrix[i][j]);

            }

            System.out.print('\n');
        }

        System.out.print('\n');
    }
}