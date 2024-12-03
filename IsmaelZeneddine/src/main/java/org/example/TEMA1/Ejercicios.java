package org.example.TEMA1;

import java.util.InputMismatchException;
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

    public void ejer1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();
        if (num1 > 0)
            System.out.println("El " + num1 + " es un numero positivo");
        else if (num1 < 0) {
            System.out.println("El " + num1 + " es un numero negativo");
        } else {
            System.out.println("El " + num1 + " es un numero natural");
        }
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

    public void ejer3() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = entrada.nextInt();
        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("ERROR: no se puede dividir entre 0");
        }

    }

    public void ejer4() {
        Scanner entrada = new Scanner(System.in);

        int base = 0;
        int altura = 0;
        int area = 0;
        boolean base_r = true;
        boolean altura_r = true;

        while (base_r == true) {

            try {
                System.out.println("Dame el valor de la base del triángulo");
                base = entrada.nextInt();

                if (base > 0) {

                    base_r = false;
                    while (altura_r == true) {
                        System.out.println("");
                        System.out.println("Dame el valor de la altura del triángulo");
                        altura = entrada.nextInt();

                        if (altura > 0) {
                            altura_r = false;
                            System.out.println("");
                            System.out.println("CALCULANDO ÁREA DEL TRIÁNGULO DADO...");
                            area = (base * altura) / 2;
                            System.out.println("El área del triángulo es: " + area);

                        } else {
                            System.out.println("El valor de la altura tiene que ser positivo...");

                        }
                    }

                } else {
                    System.out.println("El valor de la base tiene que ser positivo...");

                }

            } catch (InputMismatchException er) {
                System.out.println("ERROR. Introduce un número válido...");
                entrada.nextLine();
            }
        }
    }
}