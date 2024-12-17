package org.example;
import java.util.Scanner;

/**
 * Proyecto del ProgramaMe: Juego del Ahorcado/Verdugo
 * @author
 * @version 1.1 (12/12/2024)
 */

public class Verdugo {
    Scanner teclado = new Scanner(System.in);

    public void principal() {
        String resultado;

        while (true) {
            String respuesta = teclado.next().trim();
            if (respuesta.equals(".")) {
                break;
            }

            String[] letrasUsuario1 = usuario1(respuesta);
            String[] letrasUsuario2 = usuario2Adivinador();
            resultado = comprobacion(letrasUsuario1, letrasUsuario2);
            System.out.println(resultado);
        }
    }

    public static String[] usuario1(String respuesta) {
        String palabra = respuesta.trim().toLowerCase();
        String[] letrasUsuario1 = palabra.split("");
        return letrasUsuario1;
    }

    public static String[] usuario2Adivinador() {
        Scanner teclado = new Scanner(System.in);
        String letras = teclado.next().trim().toLowerCase();
        String[] letrasUsuario2 = letras.split("");
        return letrasUsuario2;
    }

    public static String comprobacion(String[] letrasUsuario1, String[] letrasUsuario2) {
        int falladas = 0;
        String letrasAcertadas = "";
        String letrasFalladas = "";

        for (int i = 0; i < letrasUsuario2.length; i++) {
            String letra = letrasUsuario2[i];

            if (letrasAcertadas.contains(letra) || letrasFalladas.contains(letra)) {
                continue;
            }

            boolean encontrada = false;
            for (int j = 0; j < letrasUsuario1.length; j++) {
                if (letra.equals(letrasUsuario1[j])) {
                    encontrada = true;
                    break;
                }
            }

            if (encontrada) {
                letrasAcertadas += letra;
            } else {
                letrasFalladas += letra;
                falladas++;
            }

            if (falladas >= 7) {
                return "AHORCADO";
            }

            if (letrasAcertadas.length() == letrasUsuario1.length) {
                return "SALVADO";
            } else {
                return "COLGANDO";
            }
        }
        return "";
    }
}
