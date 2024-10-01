package org.example;
import java.util.Scanner;


public class Ejercicios {
    public void actividad_inicial() {

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

            if (num1 == num2) {
                System.out.println("ERROR. Los numeros son iguales.");
            }
        }
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);
    }
    public void ejer1(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();
    }
    public void ejer2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = entrada.nextInt();

        if (num1 < num2) {
            System.out.println("El " + num1 + " es menor a " + num2);
        } else if (num1 > num2) {
            System.out.println("El " + num1 + " es mayor a  " + num2);
        } else {
            System.out.println("ERROR: Los números introducidos son iguales");
        }
    }
}