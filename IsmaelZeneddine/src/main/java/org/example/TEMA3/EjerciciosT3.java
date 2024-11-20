package org.example.TEMA3;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosT3 {
    Scanner teclado = new Scanner(System.in);

    public void ejer1() {
        Random aleatorio = new Random();
        int numeros[] = new int[10];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = aleatorio.nextInt(501);
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es = " + suma);
    }

    public void ejer2() {
        int numeros[] = new int[5];
        System.out.println("Introduce los numeros a invertir");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(" " + numeros[i] + " ");
        }
    }

    public void ejer3() {
        Random aleatorio = new Random();
        int numeros[] = new int[25];
        int num = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(101);
        }
        System.out.println("Ingresa un numero del 0 al 100: ");
        num = teclado.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[1]) {
                contador++;
            }
        }
        System.out.println("El numero " + num + " aparece " + contador + " veces en el array ");
    }

    public void ejer5() {
        int numeros[] = {3, 5, 2, 1, 4};
        int ultima_posicion = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultima_posicion;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
    }

    public void eliminarDuplicados() {
        int vector1[] = {1, 1, 6, 7, 8, 8, 10, 15, 15};
        int vectorAux[] = new int[vector1.length];
        ;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] == vector1[i + 1]) ;
            else {
                vectorAux[i] = vector1[i];
            }
        }
    }

    public void triangulo() {
        int altura = teclado.nextInt();

        for (int i = altura; i >= 1; i--) {
            for (int j = altura; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void tablasMultiplicar() {
        for (int i = 1; i <=10;i++){
            for (int j = 1; j <=10; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
    }
}