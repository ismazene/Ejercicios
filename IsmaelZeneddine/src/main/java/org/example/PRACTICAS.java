
package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PRACTICAS {
    public void practica3() {
        System.out.println("Introduce tu nombre:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();

        int edad;
        while (true) {
            System.out.println("Hola " + nombre + ". Introduce tu edad:");
            edad = entrada.nextInt();

            if (edad > 0) {
                break;
            } else {
                System.out.println("La edad debe ser un número positivo. Intenta de nuevo.");
            }
        }

        if (edad < 18) {
            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            int resultado = 18 - edad;
            System.out.println("Te faltan " + resultado + " años para ser mayor de edad.");
        } else {
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
        }
    }
    public void practica4() {
        Scanner entrada = new Scanner(System.in);
        int mult1 = 0;
        int mult2 = 0;


        while (true) {
            try {
                System.out.println("Introduce el primer multiplicando (3 cifras):");
                mult1 = entrada.nextInt();

                mult2 = entrada.nextInt();

                if (mult1 > 99 && mult2 > 99) {
                    break;
                } else System.out.println("ERROR:Debes de introducir un numero positivo");
            } catch (InputMismatchException er) {
                System.out.println("ERROR: Debes introducir un numero en positivo");
            }


            int resultado = mult1 * mult2;
            System.out.println("El producto de la multiplicación es: " + resultado);
            System.out.println("El proceso es: ");
            System.out.println("  " + mult1);
            System.out.println("x " + mult2);
            System.out.println("-------");

            String multiplicacion = Integer.toString(mult2);
            String digito = multiplicacion.substring(0, 1);
            int dig1 = Integer.parseInt(digito);
            String digito1 = multiplicacion.substring(1, 2);
            int dig2 = Integer.parseInt(digito1);
            String digito2 = multiplicacion.substring(2, 3);
            int dig3 = Integer.parseInt(digito2);

            System.out.println("   " + mult1 * dig1);
            System.out.println("  " + mult1 * dig2 + "x");
            System.out.println(" " + mult1 * dig1 + "xx");
            System.out.println("-------");
            System.out.println(mult1 * mult2);

        }
    }
}
