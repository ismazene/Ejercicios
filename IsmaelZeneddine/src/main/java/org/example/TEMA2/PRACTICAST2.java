package org.example.TEMA2;
import java.util.Scanner;


public class PRACTICAST2 {
    public void practica1() {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
            String fecha = entrada.nextLine();

            // Verificar las posiciones de las barras
            if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                System.out.println("Error: El formato de la fecha debe ser dd/mm/aaaa y no puede ser numeros negativos.");
                return;
            }
            // Extraer los componentes con losque vamos a trabajar de la fecha
            String diaString = fecha.substring(0, 2);
            String mesString = fecha.substring(3, 5);
            String anyoString = fecha.substring(6, 10);

            // Convertir numeros a enteros
            int dia = Integer.parseInt(diaString);
            int mes = Integer.parseInt(mesString);
            int anyo = Integer.parseInt(anyoString);

            // Verificar si los numeros son ceros
            if (dia == 0 || mes == 0 || anyo == 0) {
                System.out.println("Error: La fecha no puede contener ceros.");
                return;
            }

            if (mes < 1 || mes > 12) {
                System.out.println("Error: El mes debe estar entre 1 y 12.");
                return;
            }

            //Hacemos la suma del dia mes y año
            int suma = dia + mes + anyo;
            System.out.println(diaString + " + " + mesString + " + " + anyoString + " = " + suma);

            //Pasamos de suma a cadena
            String sumaString = Integer.toString(suma);

            //Cogemos cada digito por separado con subcadenas
            String numero1 = sumaString.substring(0, 1);
            String numero2 = sumaString.substring(1, 2);
            String numero3 = sumaString.substring(2, 3);
            String numero4 = sumaString.substring(3, 4);

            // Convertir las subcadenas a enteros
            int digito1 = Integer.parseInt(numero1);
            int digito2 = Integer.parseInt(numero2);
            int digito3 = Integer.parseInt(numero3);
            int digito4 = Integer.parseInt(numero4);

            //Hacemos la suma y la mostramos por pantalla
            int suma_anyo = digito1 + digito2 + digito3 + digito4;
            System.out.println(digito1 + " + " + digito2 + " + " + digito3 + " + " + digito4 + " = " + suma_anyo);

            // Suma los dígitos unicamente del año basado en el resultado anterior y se muestra por pantalla
            int suma_Anyo = digito1 + digito2 + digito3 + digito4;
            System.out.println("Tu número de la suerte es " + suma_Anyo);

        } catch (NumberFormatException e) {
            System.out.println("Error: Introduce un número válido en la fecha.");
            entrada.nextLine();
        }
    }
}