package org.example.TEMA2;
import java.util.Scanner;


public class EjerciciosT2 {
    public void ejer1() {
        String Frase = "Yo me porto bonito";
        System.out.println(Frase);

        int longitud = Frase.length();
        System.out.println(longitud);

        String espacios = Frase.replace("", "");

    }
    public void ejer4() {
        Scanner entrada = new Scanner(System.in);
        String texto = "Hola Mundo, bienvenido  Mundo. Mundo es genial";
        String subcadena = "Mundo";
        if (subcadena.equals(1)) {
            System.out.println("Palabra encontrada");

        } else {
            System.out.println("Palabara no encontrada");
        }
    }
}