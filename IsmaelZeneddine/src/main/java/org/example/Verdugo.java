package org.example;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Proyecto del ProgramaMe
 * @author Ismael
 * @version 1.0 (11/12/2024)
 */

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

        if (palabraSinEspacios.length() > 100) {
            System.err.println("No puedes poner más de 100 letras.");
        }
        String palabraMinuscula = palabra.toLowerCase();
        return  palabraMinuscula;
    }

    public static String Usuario2Adivinador() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuáles son las letras con las que vamos a trabajar?");
        String letras = teclado.next();
        String letrasSinEspacios = letras.trim();

        String letrasUsario2[] = letras.split("");
        System.out.println(Arrays.toString(letrasUsario2));
        return letras;
    }

    public static String Comprobacion(String letrasUsario2, String palabraMinuscula) {
        for (int i = 0; i<letrasUsario2.length();i++){
            for (int j = 0; Integer.parseInt(letrasUsario2[i]); i++){

            }
        }


        return "";
    }
}
    //Para salirse con el punto solo debemos hacerlo con el if(hasNext) sirve para saber si el usuario da algo o no.
//    public class solution {
//
//        static java.util.Scanner in;
//
//        public static boolean casoDePrueba() {
//            if (!in.hasNext())
//                return false;
//            else {
//                // CÓDIGO PRINCIPAL AQUÍ
//                // (incluyendo la lectura del caso de prueba)
//                return true;
//            }
//        } // casoDePrueba
//
//        public static void main(String[] args) {
//            in = new java.util.Scanner(System.in);
//            while (casoDePrueba()) {
//            }
//        } // main
//
//    } // class solution

