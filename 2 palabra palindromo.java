package org.example;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word_palindrome;

        System.out.println("Escribe una palabra");
        word_palindrome = input.next();

        int longi = word_palindrome.length();
        char[] word = new char[longi];

        for(int i = 0; i < longi; i++ ){

            word[i] = word_palindrome.charAt(i);

        }
        
        int x = 0; 
        int z = longi - 1;
        int counter = 0;

        while (counter < longi) {

            counter++;

            if (word[x] == word[z]) {

                if (z == 0 && x == longi-1) {

                    System.out.println("si es palindromo");

                }
                
                x++;
                z = z - 1;


            }
        }
    }
}