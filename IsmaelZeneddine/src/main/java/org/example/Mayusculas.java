package org.example;
import java.util.Scanner;

public class Mayusculas {
    public static void principal(){
        String cadena = pedirCadena();
        cadena = cadena(cadena);
        contarVocales(cadena);


    }
    public static String pedirCadena(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una cadena :)");
        String cadena = teclado.next();
        return cadena;
    }
    public static String cadena(String cadena){
        //1
     String cadenaMayuscula = cadena.toUpperCase();
     return cadenaMayuscula;
    }
    public static void contarVocales(String cadenaMayuscula){
        int contador = 0;

        for (int i = 0; i < cadenaMayuscula.length() ; i++) {
            if (cadenaMayuscula.charAt(i)=='A' ||cadenaMayuscula.charAt(i)=='E'||cadenaMayuscula.charAt(i)=='I'||cadenaMayuscula.charAt(i)=='O'||cadenaMayuscula.charAt(i)=='U'){
                contador ++;
            }
        }
        System.out.println("El numero total de vocales es " + contador);
    }
}
