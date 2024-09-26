package org.example;
import java.util.Scanner;

public class Ejercicios {
    public void actividad_inicial(){

        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();

        System.out.println("¿A qué curso vas?");
        String curso = entrada.nextLine();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2) {
            System.out.println("Introduce un numero");
            num1 = entrada.nextInt();

            System.out.println("Introduce otro numero");
            num2 = entrada.nextInt();

            if (num1==num2){
                System.out.println("ERROR. Los numeros son iguales.");
            }
        }
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);
    }
}