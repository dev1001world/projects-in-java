package org.example;
// 3 / 1  / 12  / 16 no necesitamos los otros valores pues ya esta calculado, solo con la cantidad de estudiantes por grupo
public class Main {
    public static void main(String[] args) {
        int numberStudents;
        int numberGroups = Integer.parseInt(args[0]);

        for (int i = 1; i <= numberGroups; i++){
            numberStudents = Integer.parseInt(args[i]);
            System.out.println("El costo total del caso " + i + " es: " + subscriptionValue(numberStudents));
        }

    }
    public static int subscriptionValue(int numberStudents) {
        int totalCost = 0;
        int cotsSubscritonsBase = 100;
        int costForSixStuents = 250;
        int costAdditionalForStudents = 30;
        int maxSibcriptionForStudents = 6;

        while (numberStudents > 0) {
            if (numberStudents >= maxSibcriptionForStudents) {
                totalCost += costForSixStuents ;
                numberStudents -= maxSibcriptionForStudents;
            } else {
                totalCost += cotsSubscritonsBase + (numberStudents - 1) * costAdditionalForStudents;
                numberStudents = 0;
            }
        }
        return totalCost;
    }
}