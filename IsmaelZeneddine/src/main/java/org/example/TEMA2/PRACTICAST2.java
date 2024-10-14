package org.example.TEMA2;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PRACTICAST2 {
    public void practica1() {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
            String fecha = entrada.nextLine();

            // Extraer los componentes de la fecha
            String diaString = fecha.substring(0, 2);
            String mesString = fecha.substring(3, 5);
            String anyoString = fecha.substring(6, 10);

            // Convertir a enteros
            int dia = Integer.parseInt(diaString);
            int mes = Integer.parseInt(mesString);
            int anyo = Integer.parseInt(anyoString);

            int suma = dia + mes + anyo;
            System.out.println(diaString + "+" + mesString + "+" + anyoString + " = " + suma);

            // Extraer cada dígito del año como string
            String numero1 = anyoString.substring(0, 1);
            String numero2 = anyoString.substring(1, 2);
            String numero3 = anyoString.substring(2, 3);
            String numero4 = anyoString.substring(3, 4);

            // Convertir las subcadenas a enteros
            int digito1 = Integer.parseInt(numero1);
            int digito2 = Integer.parseInt(numero2);
            int digito3 = Integer.parseInt(numero3);
            int digito4 = Integer.parseInt(numero4);

            int suma_anyo = digito1 + digito2 + digito3 + digito4;
            System.out.println(digito1 + "+" + digito2 + "+" + digito3 + "+" + digito4 + " = " + suma_anyo);

            // Sumar los dígitos del año
            int sumaDígitosAnyo = digito1 + digito2 + digito3 + digito4;
            System.out.println("Tu numero de la suerte es " + sumaDígitosAnyo);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }}
