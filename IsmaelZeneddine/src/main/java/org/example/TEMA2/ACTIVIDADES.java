package org.example.TEMA2;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ACTIVIDADES {
    public void actividad1 (){

            System.out.println("BIENVENIDO A LA CLASIFICACION DE GENERACIONES:");
            System.out.println("Elige un modo: ");
            System.out.println("1. Año nacimiento");
            System.out.println("2. Edad");

            Scanner teclado = new Scanner(System.in);

            String modo = teclado.next();

            LocalDateTime hoy = LocalDateTime.now();
            int anyoActual = hoy.getYear();
            int anyoNacimiento = 1800;
            boolean error = false;

            switch (modo){
                case "1":
                    System.out.println("Introduce tu año de nacimiento: ");

                    String año = teclado.next();

                    try{
                        anyoNacimiento = Integer.parseInt(año);
                    }catch (NumberFormatException e1){
                        System.out.println("El formato del año no es correcto" + e1.getMessage());
                    }

                    if (anyoNacimiento < 1900 || anyoNacimiento > anyoActual){
                        System.out.println("El año introducido no es correcto");
                        error = true;
                    }
                case "2":
                    System.out.println("introduce tu edad: ");
                    int edad = 0;

                    if (teclado.hasNextInt()) {
                        edad = teclado.nextInt();
                    }else {
                        System.out.println("El formato de la edad es incorrecto");
                        error = true;
                    }
                    if (edad < 0){
                        System.out.println("La edad introducida no es correcto");
                        error = true;
                    }else{
                        anyoNacimiento = anyoActual - edad;
                    }
                    break;
                default:
                    System.out.println("El modo no existe");
                    error = true;
            }

//            if (modo.equals("1")){

//                System.out.println("Introduce tu año de nacimiento: ");
//
//                String año = teclado.next();
//
//                try{
//                    anyoNacimiento = Integer.parseInt(año);
//                }catch (NumberFormatException e1){
//                    System.out.println("El formato del año no es correcto" + e1.getMessage());
//                }
//
//                if (anyoNacimiento < 1900 || anyoNacimiento > anyoActual){
//                    System.out.println("El año introducido no es correcto");
//                    error = true;
//                }
//
//            } else if (modo.equals("2")) {
//
//                System.out.println("introduce tu edad: ");
//                int edad = 0;
//
//                if (teclado.hasNextInt()) {
//                    edad = teclado.nextInt();
//                }else {
//                    System.out.println("El formato de la edad es incorrecto");
//                    error = true;
//                }
//                if (edad < 0){
//                    System.out.println("La edad introducida no es correcto");
//                    error = true;
//                }else{
//                    anyoNacimiento = anyoActual - edad;
//                }

//            }else{
//                System.out.println("El modo no existe");
//                error = true;
//            }
            if (!error) {
                if (anyoNacimiento >= 1900 && anyoNacimiento <= 1927) {
                    System.out.println("Eres de la generacion sin bautizar");
                } else if (anyoNacimiento >= 1928 && anyoNacimiento <= 1944) {
                    System.out.println("Eres de la generación Silent");
                } else if (anyoNacimiento >= 1945 && anyoNacimiento <= 1964) {
                    System.out.println("Eres de la generación Baby Boomers");
                } else if (anyoNacimiento >= 1965 && anyoNacimiento <= 1981) {
                    System.out.println("Eres de la generación X");
                } else if (anyoNacimiento >= 1982 && anyoNacimiento <= 1994) {
                    System.out.println("Eres de la generación Millenial");
                } else if (anyoNacimiento >= 1995 && anyoNacimiento <= anyoActual) {
                    System.out.println("Eres de la generación Millenial");
                } else {
                    System.out.println("No tienes generación");
                }
            }

    /* Sin Generación bautizada (nacidos entre 1900 y 1927).
       Generación Silent (nacidos entre 1928 y 1944).
       Baby Boomers (nacidos entre 1945 y 1964).
       Generación X (nacidos entre 1965 y 1981).
       Generación Y o Millennials (nacidos entre 1982 y 1994).
       Generación Z o Centennials (nacidos entre 1995 y 2009 en adelante).    */

        }
    }
