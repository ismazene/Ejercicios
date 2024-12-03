package org.example.TEMA1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public void control_excepciones(){
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean error = true;

        while (error==true) {
            try {
                System.out.println("Introduce un numero...");
                numero = entrada.nextInt();
                error = false;
            }catch (InputMismatchException er) {
                System.out.println("ERROR Escribe un valor valido");
                entrada.nextLine();
            }
        }
    }
    public void expcepciones(){
        Scanner teclado = new Scanner(System.in);

        int dividendo = teclado.nextInt();
        String divisor = teclado.next();
        int divisor_entero = Integer.parseInt(divisor);

        int resultado = dividendo/divisor_entero;
    }
}
