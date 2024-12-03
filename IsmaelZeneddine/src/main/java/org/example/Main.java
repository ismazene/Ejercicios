package org.example;
import org.example.TEMA1.*;
import org.example.TEMA2.*;
import org.example.TEMA3.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Cara Cruz????");
        String opcion = teclado.next();

        //LLAMAR AL SORTEO
        String resultado = sorteo();

            if (resultado.equals(opcion)) {
                System.out.println("Has ganado. Ha salido: " + resultado);
            } else {
                System.out.println("Has perdido. Ha salido: " + resultado);
            }
        }
    public static void comprobarOpcion (String resultado, String opcion){

    }

    public static String sorteo() {
        Random aleatorio = new Random();
        String opciones[] = {"Cara", "Cruz"};

        String resultado = opciones[aleatorio.nextInt(2)];
        return resultado;
    }
}
