package org.example;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Proyecto del ProgramaMe
 * @author Ismael
 * @version 1.0 (12/12/2024)
 */

public class Solution {

    static Scanner in = new Scanner(System.in);  // Usamos una sola instancia de Scanner

    // Clase Verdugo fuera del método casoDePrueba
    static class Verdugo {

        // Método principal que organiza el flujo del juego
        public static void principal() {
            String[] letrasUsario1 = Usuario1(); // Aquí guardas el arreglo retornado por Usuario1
            String[] letras = Usuario2Adivinador();
            String resultado = Comprobacion(letrasUsuario1, letrasUsuario2);
            System.out.println("Resultado: " + resultado);  // Muestra el resultado
        }

        // Método para pedir la palabra que el jugador 1 usará
        public static String[] Usuario1() {
            Scanner teclado = new Scanner(System.in);

            System.out.println("¿Cuál es la palabra con la que vamos a jugar?");
            String palabra = teclado.next();
            String palabraSinEspacios = palabra.trim();

            if (palabraSinEspacios.length() > 100) {
                System.err.println("No puedes poner más de 100 letras.");
            }

            String palabraMinuscula = palabra.toLowerCase();
            String[] letrasUsuario1 = palabraMinuscula.split("");  // Divide la palabra en letras individuales
            System.out.println(Arrays.toString(letrasUsuario1));

            return letrasUsuario1;
        }

        // Método para pedir las letras que el jugador 2 va a adivinar
        public static String[] Usuario2Adivinador() {
            Scanner teclado = new Scanner(System.in);

            System.out.println("¿Cuáles son las letras con las que vamos a trabajar?");
            String letras = teclado.next();
            String palabraMinuscula = letras.toLowerCase();
            String letrasSinEspacios = letras.trim();
            String[] letrasUsuario2 = letras.split("");
            System.out.println(Arrays.toString(letrasUsuario2));
            return letrasUsuario2;
        }

        // Método para comprobar las letras
        public static String Comprobacion(String[] letrasUsuario1, String[] letrasUsuario2) {
            int contador = 0;
            for (int i = 0; i < letrasUsuario1.length; i++) {
                for (int j = 0; j < letrasUsuario2.length; j++) {
                   if (letrasUsuario1[i] != letrasUsuario2[j]){

                    contador++;
                   }

                }
            }
            if (contador == letrasUsuario1.length){
                System.out.println("SALVADO");
            } else if (letrasUsuario2.length < letrasUsuario1.length){
                System.out.println("COLGANDO");
            }
            return "";
        }


        }

    // Método que ejecuta un caso de prueba
    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            Verdugo.principal();  // Llamada al método principal del verdugo
            return true;
        }
    }

    // Método principal que ejecuta el flujo
    public static void main(String[] args) {
        while (casoDePrueba()) {
            // El bucle se repite mientras haya entradas
        }
    }
}
