package org.example.TEMA4;

import java.util.Scanner;

public class Recursividad {

    public static void imprimirMenu() {

        System.out.println("***Bateria de ejercicios sobre recursividad***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");

        System.out.println("1- Digitos");
        System.out.println("2- Potencias");
        System.out.println("3- Del reves");
        System.out.println("4- Binario");
        System.out.println("5- A Binario");
        System.out.println("6- Orden alfabetico");
        System.out.println("7- Mostrar suma");

    }

    public static void Ejer1() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero mayor que cero");
        int num = teclado.nextInt();

        if (num <= 0) {
            System.err.println("Debes introducir un numero mayor a 0");
            return;
        } else {
            if (num == 0) {
                System.out.println("0");
            }
        }
        int contador = 0;
        if (num != 0) {
            for (int i = num; i > 0; i /= 10) {
                contador++;
            }
            System.out.println("El numero de dígitos de " + num + " es: " + contador);
        }
    }

    public static void Ejer2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = teclado.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.err.println("Los numeros deben ser positivos");
        } else {
            int resultado = 1;
            for (int i = 0; i < num1; i++) {
                resultado *= num2;
            }
            System.out.println("El resultado es" + resultado);
        }
    }

    public static void menuFinal() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Elige una opcion");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - SALIR");
        String opcionfinal = teclado.next();
        String OpcionFinalMayusculas = opcionfinal.toUpperCase();


        switch (OpcionFinalMayusculas) {
            case "M":
                System.out.flush();
                imprimirMenu();
                break;
            case "X":
                System.exit(0);
        }
    }

    public static int seleccionarEjer(){
        Scanner teclado = new Scanner(System.in);
        int numCase = teclado.nextInt();
        return numCase;
    }

    public static void main(String[] args) {
        imprimirMenu();
        int numCase = seleccionarEjer();

        switch (numCase) {
            case 1:
                Ejer1();
                menuFinal();
                while (true){
                    imprimirMenu();
            }
            case 2:
                Ejer2();
                menuFinal();
                break;
            default:
                System.out.println("Opción no valida");
        }

    }
}
todo dentro de un while truuuuuueeee