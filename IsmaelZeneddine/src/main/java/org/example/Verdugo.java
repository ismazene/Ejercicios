package org.example;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Proyecto del ProgramaMe: Juego del Ahorcado/Vedugo
 * @author Ismael Zeneddine Ouahdi
 * @version 1.1 (12/12/2024)
 */

public class Verdugo {

    /**
     * Este es el metodo proncipal en el que entran todos los datos de los demas metodos
     */
    public static void principal() {
        Scanner teclado = new Scanner(System.in);
        String resultado;

        // Repite el proceso hasta que el usuario ingrese "."
        while (true) {
            String respuesta = teclado.next().trim();
            if (respuesta.equals(".")) {
                break;
            }

            String[] letrasUsuario1 = Usuario1(respuesta);
            String[] letrasUsuario2 = Usuario2Adivinador();
            resultado = Comprobacion(letrasUsuario1, letrasUsuario2);
            System.out.println(resultado);

        }
    }

    /**
     *
     * @return
     */
    public static String[] Usuario1(String respuesta) {
        //Scanner teclado = new Scanner(System.in);
        //String palabra = teclado.next().trim().toLowerCase();
        String palabra = respuesta.trim().toLowerCase();

        if (palabra.length() > 100) {
            System.err.println("Error: No puedes poner más de 100 letras.");
        }

        String[] letrasUsuario1 = palabra.split("");
        return letrasUsuario1;
    }

    public static String[] Usuario2Adivinador() {
        Scanner teclado = new Scanner(System.in);
        String letras = teclado.next().trim().toLowerCase();
        String[] letrasUsuario2 = letras.split("");
        return letrasUsuario2;
    }

    public static String Comprobacion(String[] letrasUsuario1, String[] letrasUsuario2) {
        int aciertos = 0;
        String letras_acertadas = "";
        int falladas = 0;

        for (int i = 0; i < letrasUsuario1.length; i++) {
            for (int j = 0; j < letrasUsuario2.length; j++) {
                if (letrasUsuario1[i].equals(letrasUsuario2[j]) && !letras_acertadas.contains(letrasUsuario1[i])) {
                    aciertos++;
                    letras_acertadas += letrasUsuario1[i];
                }
            }
        }

        System.out.println(aciertos + " " + falladas + " " + letras_acertadas);

        if ((letrasUsuario2.length - aciertos) >=7){
            return "AHORCADO";
        } else if (letras_acertadas.equals()) {
            return "SALVADO";
        } else{
            return "COLGANDO";
        }
    }
}
