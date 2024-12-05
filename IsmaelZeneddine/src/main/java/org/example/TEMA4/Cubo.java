package org.example.TEMA4;
import java.util.Scanner;

public class Cubo {
    public static void Principal(){

        int numero = pedirNumero();
        calcularCubo(numero);
    }
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int numero = teclado.nextInt();
        return numero;
    }
    public static void calcularCubo(int numero){
        int resultado = numero*numero*numero;
        System.out.println("El cubo de " + numero + " es " + resultado);
    }
}
