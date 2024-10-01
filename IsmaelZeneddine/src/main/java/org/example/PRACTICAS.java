
package org.example;
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

        System.out.println("Introduce el primer multiplicando (3 cifras):");
        int mult1 = entrada.nextInt();

        System.out.println("Introduce el segundo multiplicando (3 cifras):");
        int mult2 = entrada.nextInt();

        int resultado = mult1 * mult2;
        System.out.println("El producto de la multiplicación es: " + resultado);
        System.out.println("El proceso es: ");
        System.out.println("  " + mult1);
        System.out.println("x " + mult2);
        System.out.println("-------");
    }
}
