package org.example.TEMA2;
import java.util.Scanner;


public class EjerciciosT2 {
    public void ejer1() {
        String Frase = "Yo me porto bonito";
        System.out.println(Frase);

        int longitud = Frase.length();
        System.out.println(longitud);

        String espacios = Frase.replace("", "");

    }

    public void ejer4() {
        Scanner entrada = new Scanner(System.in);
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
    public void ejerAmpliacion2 () {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame tu altura en cm");
        int altura = entrada.nextInt();

        if (altura <= 150){
            System.out.println("Persona de altura baja");
        } else if (altura >= 151 && altura <= 175) {
            System.out.println("Pesona de altura media");
        } else if (altura > 176) {
            System.out.println("Persona alta");
        }


    }
    }
