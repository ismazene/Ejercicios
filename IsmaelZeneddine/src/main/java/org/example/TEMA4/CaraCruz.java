package org.example.TEMA4;
import java.util.Random;
import java.util.Scanner;

public class CaraCruz {
    public static void principal(){
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Cara Cruz????");
        String opcion = teclado.next();

        //LLAMAR AL SORTEO
        String resultado = sorteo();
        comprobarOpcion(opcion, resultado); //Con esto llamamos a la funcion sorteo!!!!
    }
    public static void comprobarOpcion (String resultado, String opcion){
        if (resultado.equals(opcion)) {
            System.out.println("Has ganado. Ha salido: " + resultado);
        } else {
            System.out.println("Has ganado. Ha salido: " + resultado);
        }
    }
    public static String sorteo() {
        Random aleatorio = new Random();
        String opciones[] = {"Cara", "Cruz"};

        String resultado = opciones[aleatorio.nextInt(2)];
        return resultado;
    }
}
