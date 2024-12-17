package org.example;
import java.util.Scanner;

/**
 * Proyecto del ProgramaMe: Juego del Ahorcado/Verdugo
 * @author Ismael
 * @version 1.1 (17/12/2024)
 */

public class Verdugo {

    public static void principal() {
        Scanner teclado = new Scanner(System.in);
        String resultado;

        while (true) {
            String respuesta = teclado.nextLine().trim();
            if (respuesta.equals(".")) {
                break;
            }

            // Validación para no permitir números
            if (!respuesta.matches("[a-zA-Z]+")) {
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
        String letras;

        while (true) {
            letras = teclado.nextLine().trim().toLowerCase();

            // Validación para no permitir números
            if (!letras.matches("[a-zA-Z]+")) {
            } else {
                break;
            }
        }

        String[] letrasUsuario2 = letras.split("");
        return letrasUsuario2;
    }

    public static String comprobacion(String[] letrasUsuario1, String[] letrasUsuario2) {
        int falladas = 0;
        String letrasAcertadas = "";
        String letrasFalladas = "";
        int letrasEncontradas = 0; // Contador de letras correctas encontradas

        for (int i = 0; i < letrasUsuario2.length; i++) {
            String letra = letrasUsuario2[i];

            if (letrasAcertadas.contains(letra) || letrasFalladas.contains(letra)) {
                continue; // Ignora letras repetidas
            }

            boolean encontrada = false;
            for (int j = 0; j < letrasUsuario1.length; j++) {
                if (letra.equals(letrasUsuario1[j])) {
                    encontrada = true;
                    break;
                }
            }

            if (encontrada) {
                letrasAcertadas += letra; // Añade letra a acertadas
                letrasEncontradas++;
            } else {
                letrasFalladas += letra; // Añade letra a falladas
                falladas++;
            }

            if (falladas >= 7) {
                return "AHORCADO";
            }

            if (letrasEncontradas == letrasUsuario1.length) {
                return "SALVADO";
            }
        }
        return "COLGANDO";
    }
}
