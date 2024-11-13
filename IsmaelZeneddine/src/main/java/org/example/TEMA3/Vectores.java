package org.example.TEMA3;
import java.util.Arrays;
import java.util.Scanner;

public class Vectores {
    Scanner teclado = new Scanner(System.in);
    public void vectores(){
        int vector [];
        vector = new int[7];

        vector[2] = 7;
        vector[5] = vector[2]+4;

        System.out.println(vector );

        for (int i=0;i<vector.length;i++){
            System.out.println(" "+ vector[i] + " ");
            String palabras[] = new String[3];
        }
    }
    public void navidad(){
        final String palabra = "NAVIDAD";
        System.out.println("Introduce las letras a mostrar...");
        String cantidad = teclado.nextLine();

        String cantidades[] = cantidad.split(" ");
        String letras[] = palabra.split("");

        System.out.println(Arrays.toString(cantidades));
        System.out.println(Arrays.toString(letras));

        String resultado = "";

        for (int i = 0; i<letras.length;i++){
            for (int j = 0; i<Integer.parseInt(cantidades[i]);i++){
                resultado = resultado + letras[i];
            }
        }
        System.out.println(resultado);
    }

}
