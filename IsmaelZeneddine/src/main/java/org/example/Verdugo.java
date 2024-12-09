package org.example;
import java.util.Scanner;

public class Verdugo {

    public static void principal() {
        String palabra = Usuario1();
        String letras = Usuario2();
        String resultado = Comprobacion(letras, palabra);

        System.out.println("Resultado del juego: " + resultado);
    }

    public static String Usuario1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuál es la palabra con la que vamos a jugar?");
        String palabra = teclado.next();
        return palabra.toLowerCase();
    }

    public static String Usuario2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuáles son las letras con las que vamos a trabajar?");
        String letras = teclado.next();

        if (letras.length() > 100) {
            System.err.println("No puedes poner más de 100 letras.");
            return "";
        }

        if (letras.contains("ñ")) {
            System.err.println("No uses la 'ñ', estamos usando el alfabeto inglés.");
            return "";
        }

        return letras.toLowerCase();
    }

    public static String Comprobacion(String letras, String palabra) {
        int fallos = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!letras.contains(String.valueOf(letra))) {
                fallos++;
            }
        }

        if (fallos >= 7) {
            return "AHORCADO";
        }

        for (int i = 0; i < palabra.length(); i++) {
            if (!letras.contains(String.valueOf(palabra.charAt(i)))) {
                return "COLGANDO";
            }
        }

        return "SALVADO";
    }
    }
