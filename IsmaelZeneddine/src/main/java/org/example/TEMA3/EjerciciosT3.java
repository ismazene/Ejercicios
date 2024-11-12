package org.example.TEMA3;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosT3 {
    Scanner teclado = new Scanner(System.in);
    public void ejer1(){
        Random aleatorio = new Random();
        int numeros[] = new int[10];
        int suma = 0;
        for (int i=0;i<numeros.length;i++){

            numeros[i] = aleatorio.nextInt(501);
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es = " + suma);
    }
    public void ejer2(){
        int numeros[] = new int[5];
        System.out.println("Introduce los numeros a invertir");

        for (int i=0;i<numeros.length;i++){
            numeros[i] = teclado.nextInt();
        }
        for (int i= numeros.length-1;i>=0;i--){
            System.out.print(" " + numeros[i] + " ");
        }
        }
    public void ejer3(){
        Random aleatorio = new Random();
        int numeros[] = new int[25];
        int num = 0;
        int contador = 0;

        for (int i=0;i<numeros.length;i++){
            numeros[i] = aleatorio.nextInt(101);
        }
        System.out.println("Ingresa un numero del 0 al 100: ");
        num = teclado.nextInt();

        for (int i=0;i<numeros.length;i++){
            if (num == numeros[1]){
                contador++;
            }
        }
        System.out.println("El numero " + num + " aparece " + contador + " veces en el array ");
    }
    public void ejer5(){
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
}