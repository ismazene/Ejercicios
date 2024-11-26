package org.example.TEMA3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Matrices {
    Scanner teclado = new Scanner(System.in);
    Random aleatorio = new Random();


    public void matrices() {
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
        //IMPRIMIR MATRICES
        int matriz2[][] = {{2, 3, 4, 1}, {5, 10, 32, 6}};
        for (int[] fila : matriz2) {
            System.out.println(Arrays.toString(fila));

        }

        int matriz3[][] = new int[3][3];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.println("Introduce la posicion (" + i + "," + j + " )");
                matriz3[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.println("Tu matriz queda:");
                System.out.println(matriz3[i][j] + " ");

            }
        }
    }
    public void matrices2() {
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - 1; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");

        }
    }
    public void buscarMatriz() {
        int matriz[][] = new int[2][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(10);
            }
        }
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println("\n");

        }
        final int numero = 8;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Existe");
                    return;
                }
            }
        }
        System.out.println("NO existe");
    }
}
