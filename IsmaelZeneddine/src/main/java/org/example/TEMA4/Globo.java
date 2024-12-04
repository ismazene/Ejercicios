package org.example.TEMA4;

import java.util.Scanner;

public class Globo {
    public static void Globo() {
        ImprimirMenu();
        int opcion = opcionUsuario();
        comprobarOpcion(opcion);
    }

    public static void ImprimirMenu() {

        System.out.println("BIENVENIDO A GLOVOAPP");
        System.out.println("¿Que quieres comprar?");
        System.out.println("1. Comida");
        System.out.println("2. Bebida");
        System.out.println("0. Salir");
    }

    public static int opcionUsuario() {

        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        return opcion;
    }

    public static void comprobarOpcion(int opcion) {
        String pedido = "";

        if (opcion == 1) {
            pedido = comida();
        } else if (opcion == 2) {
            pedido = bebida();
        } else if (opcion == 0) {
            System.exit(0);
        } else {
            System.out.println("La opcion no es valida.");
        }
    }

    public static String comida() {
        Scanner telado = new Scanner(System.in);

        System.out.println("¿Que te apetece?");
        String eleccion = telado.next();
        return "";
    }

    public static String bebida() {
        System.out.println("Introduce la edad: ");
        int edad = opcionUsuario();

        String eleccion = "";

        if (edad >= 18) {
            eleccion = comida();
        } else {
            System.out.println("No puedes comrar bebidas");
        }

        return eleccion;
    }

    public static int pedirEdad() {
        Scanner telado = new Scanner(System.in);
        System.out.println("Cuantos años tines??");
        return 0;
    }







}



