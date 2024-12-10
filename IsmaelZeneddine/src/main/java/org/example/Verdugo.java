package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class Verdugo {

    public static void principal() {
        String palabra = Usuario1();
        String letras = Usuario2Adivinador();
        String resultado = Comprobacion(letras, palabra);
    }

    public static String Usuario1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuál es la palabra con la que vamos a jugar?");
        String palabra = teclado.next();
        String palabraSinEspacios = palabra.trim();

        if (palabra.length() > 100) {
            System.err.println("No puedes poner más de 100 letras.");
        }
        if (palabra.length() > 100) {
            System.err.println("No puedes poner más de 100 letras.");
        }
        return palabra.toLowerCase();
    }

    public static String Usuario2Adivinador() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuáles son las letras con las que vamos a trabajar?");
        String letras = teclado.next();
        String letrasSinEspacios = letras.trim();

        String letrasUsario2[] = letras.split("");
        return letras;
    }

    public static String Comprobacion(String letras, String palabra) {
        int fallos = 0;
        String acabarPrograma = ".";

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!letras.contains(String.valueOf(letra))) {
                fallos++;
            }
        }

        if (fallos >= 7) {
            System.err.println("AHORCADO");
        }

        for (int i = 0; i < palabra.length(); i++) {
            if (!letras.contains(String.valueOf(palabra.charAt(i)))) {
                System.out.println("COLGANDO");

            } else if (acabarPrograma.equals(".")) {
                break;

            } else {
                System.out.println("SALVADO");
            }
        }
        return "";
    }

}
