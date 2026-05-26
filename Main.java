package com.uce;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random(); 
        Scanner sc = new Scanner(System.in);

        int tabla[][] = new int[5][5];
        boolean tachar[][] = new boolean[5][5];

        System.out.println("¡Welcome to Bingo!");

        
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {

                if (fila == 2 && columna == 2) {
                    tabla[fila][columna] = 0;
                    tachar[fila][columna] = true;
                } else {
                    tabla[fila][columna] = random.nextInt(25) + 1;
                    tachar[fila][columna] = false;
                }
            }
        }

        while (true) {

            System.out.println("\nTabla del Jugador 1:");

            for (int fila = 0; fila < 5; fila++) {
                for (int columna = 0; columna < 5; columna++) {

                    if (tachar[fila][columna]) {
                        System.out.print("  X  ");
                    } else {
                        System.out.printf("%3d  ", tabla[fila][columna]);
                    }
                }
                System.out.println();
            }

            int numeroSacado = random.nextInt(25) + 1;
            System.out.println("\nNúmero sacado: " + numeroSacado);

           
            for (int fila = 0; fila < 5; fila++) {
                for (int columna = 0; columna < 5; columna++) {

                    if (tabla[fila][columna] == numeroSacado) {
                        tachar[fila][columna] = true;
                    }
                }
            }

            System.out.println("Presiona ENTER para el siguiente número...");
            sc.nextLine();
        }
    }
}
//Madeline Castillo, Angelo Maigualca 