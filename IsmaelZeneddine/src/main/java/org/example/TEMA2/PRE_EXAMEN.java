package org.example.TEMA2;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class PRE_EXAMEN {
    Scanner entrada = new Scanner(System.in);

    public void ejer1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String numero = scanner.next();  // Lee el número como una cadena

        // Recorre cada dígito del número
        for (int i = 0; i < numero.length(); i++) {
            char digito = numero.charAt(i); // Obtiene el dígito en la posición i
            int digitoInt = Character.getNumericValue(digito); // Convierte el carácter a un entero

            // Comprobaciones
            if (digitoInt > 0) {
                System.out.println("El dígito " + digito + " es mayor que 0.");
            } else if (digitoInt < 0) {
                System.out.println("El dígito " + digito + " es menor que 0.");
            } else {
                System.out.println("El dígito " + digito + " es igual a 0.");
            }
        }
    }

    public void ejer2() {
        System.out.println("Dame el numero base");
        String num_base = entrada.nextLine();
        int numero_base = Integer.parseInt(num_base);


        System.out.println("Dame el numero potencia");
        int num2 = entrada.nextInt();

        int total = 1;

        for (int i = 0; i <= num2; i++) {
            System.out.println("Resultado de " + numero_base + "^" + i + " = " + total);
            total *= numero_base;
        }
    }

    public void ejer3() {

        System.out.print("Introduce el número de meses de financiación: ");
        int meses = entrada.nextInt();

        int pagoMensual = 10;  // Pago inicial
        int totalPagar = 0;    // Acumulador del total a pagar

        for (int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + pagoMensual + "€");
            totalPagar += pagoMensual;  // Sumar el pago mensual al total
            pagoMensual *= 2;           // Duplicar el pago para el siguiente mes
        }

        System.out.println("Total a pagar: " + totalPagar + "€");
    }

    public void ejer4() {


                    try {
                        System.out.println("Dime una nota");
                        int num = entrada.nextInt();

                        switch (num) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                System.out.println("Suspendido");
                                break;
                            case 5:
                                System.out.println("Suficiente");
                                break;
                            case 6:
                                System.out.println("Bien");
                            case 7:
                            case 8:
                                System.out.println("Notable");
                                break;
                            case 9:
                            case 10:
                                System.out.println("SOBRESALIENTE");
                                break;

                            default:
                                System.out.println("NO VALIDO");
                        }
                    } catch (InputMismatchException e){
                        System.out.println("No es un numero entero");
                    }
            }

    public void ejer5() {
        int sueldoMaximo = 0;
        int contador = 0;
        int sueldo = 0;

        for (int i = 1; i < 5; i++) {
            System.out.println("Dame el sueldo " + i );
            sueldo = entrada.nextInt();

            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
            if (sueldo > 1000) {
                contador++;
            }
        }
        System.out.println(sueldoMaximo);
        System.out.println(contador);
    }

    public void ejer6(){

    }
}