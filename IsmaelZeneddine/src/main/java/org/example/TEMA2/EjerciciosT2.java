package org.example.TEMA2;
import java.util.Scanner;
import java.util.Random;


public class EjerciciosT2 {
    Scanner entrada = new Scanner(System.in);

    public void ejer1() {
        String Frase = "Yo me porto bonito";
        System.out.println(Frase);

        int longitud = Frase.length();
        System.out.println(longitud);

        String espacios = Frase.replace("", "");

    }

    public void ejer4() {
        String texto = "Hola Mundo, bienvenido  Mundo. Mundo es genial";
        String subcadena = "Mundo";
        if (subcadena.equals(1)) {
            System.out.println("Palabra encontrada");

        } else {
            System.out.println("Palabara no encontrada");
        }
    }

    public void ejerAmpliacion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un numero entre el 1 y el 7");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.println("1- Lunes");
                break;
            case 2:
                System.out.println("2- Martes");
                break;
            case 3:
                System.out.println("3- Miercoles");
                break;
            case 4:
                System.out.println("4- Jueves");
                break;
            case 5:
                System.out.println("5- Viernes");
                break;
            case 6:
                System.out.println("6- Sabado");
            case 7:
                System.out.println("7- Domingo");
                break;
            default:
                System.out.println("No has introducido un numero valido");
        }
    }

    public void ejerAmpliacion2() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame tu altura en cm");
        int altura = entrada.nextInt();

        if (altura <= 150) {
            System.out.println("Persona de altura baja");
        } else if (altura >= 151 && altura <= 175) {
            System.out.println("Pesona de altura media");
        } else if (altura > 176) {
            System.out.println("Persona alta");
        }


    }

    public void ejer1_random() {
        Random al = new Random();

        int dado1 = al.nextInt(6) + 1;
        System.out.println("Dado1: " + dado1);

        int dado2 = al.nextInt(6) + 1;
        System.out.println("Dado2: " + dado2);

        System.out.println("Suma: " + (dado1 + dado2));
    }

    public void ejer2_random() {
        Random al = new Random();

        String carac = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;

        String contra = "";

        int posi;

        for (int i = 0; i < longitud; i++) {

            posi = al.nextInt(carac.length());
            contra += carac.charAt(posi);
        }


    }

    public void ejer3_random() {
        Random rand = new Random();

        System.out.println("Dame un rango minimo");
        int min = entrada.nextInt();
        System.out.println("Dame un rango maximo");
        int max = entrada.nextInt();

        if (max < min) {
            System.out.println("Error:El rango maximo debe ser mayor al rango minimo");
        } else {
            System.out.println("Cuantos numeros aleatorios quieres?");
            int numeros_aleatorios = entrada.nextInt();

            for (int i = 1; i <= numeros_aleatorios; i++) {
                int aleatorio = rand.nextInt(max - min + 1) + min;
                System.out.println(aleatorio);

            }

        }

    }

    public void ejer4_random() {
        Random rand = new Random();

        String carac = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


        int posi;

        int longitud_contraseña = 6 + rand.nextInt(3);
        String contra = "";

        for (int i = 0; i < longitud_contraseña; i++) {

            posi = rand.nextInt(carac.length());
            contra += carac.charAt(posi);

        }
        System.out.println(contra);
    }
}