
package org.example.TEMA1;
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
                //Pedimos los numeros por pantalla y los guardamos como mult1 y mult2
                System.out.println("Introduce el primer multiplicando (3 cifras):");
                mult1 = entrada.nextInt();

                System.out.println("Introduce el segundo multiplicando (3 cifras):");
                mult2 = entrada.nextInt();

                //Verificamos que los numeros introducidos estan en el rango de las 3 cifras
                if (mult1 > 0 && mult1 >= 100 && mult1 <= 999 && mult2 > 0 && mult2 >= 100 && mult2 <= 999) {
                    break;
                    //Controlamos si es menor a 0
                } else if (mult1 < 0 || mult2 < 0) {
                    System.out.println("ERROR: No puedes introducir números negativos. Solo numeros de 3 cifras positivos.");
                    //Controlamos si es igual a 0
                } else if (mult1 == 0 || mult2 == 0) {
                    System.out.println("ERROR: No puedes introducir ceros. Solo numero de 3 cifras por encima de 99.");
                } else {
                    //Controlamos que sea un numero de unicamente 3 carateres
                    System.out.println("ERROR: Debes introducir números de 3 cifras.");
                }
            } catch (InputMismatchException er) {
                //Controlamos que el usuario solo pueda poner numeros, no palabras ni letras
                System.out.println("ERROR: Debes introducir un número positivo.");
                entrada.nextLine();
            }
        }

        //Guardamos el resultado de la multiplicacion en la variable resultado
        int resultado = mult1 * mult2;
        System.out.println("El producto de la multiplicación es: " + resultado);
        System.out.println("El proceso es: ");
        System.out.println("  " + mult1);
        System.out.println("x " + mult2);
        System.out.println("-------");

        //Convertimos el numero esn cadena
        String multiplicacion = Integer.toString(mult2);

            //Extraemos el digito 1
            String digito = multiplicacion.substring(0, 1);
            int dig1 = Integer.parseInt(digito);

            //Extraemos el digito 2
            String digito1 = multiplicacion.substring(1, 2);
            int dig2 = Integer.parseInt(digito1);

            //Extraemos el digito 3
            String digito2 = multiplicacion.substring(2, 3);
            int dig3 = Integer.parseInt(digito2);

        //Mostramos todo por pantalla
            System.out.println("   " + mult1 * dig3);
            System.out.println("  " + mult1 * dig2 + "x");
            System.out.println(" " + mult1 * dig1 + "xx");
            System.out.println("-------");

        System.out.println(mult1 * mult2);
    }

}

