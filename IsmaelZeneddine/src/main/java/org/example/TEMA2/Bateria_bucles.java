package org.example.TEMA2;
import java.util.Scanner;

public class Bateria_bucles {
    Scanner entrada = new Scanner(System.in);
    public void ejer1 (){
        System.out.println("Introduce la contraseña");
        String contra1 = entrada.nextLine();

        System.out.println("Vuelve a introducir la contraseña");
        String contra2 = entrada.nextLine();

        while (!contra1.equals(contra2)) {
            System.out.println("La contraseña no es correcta, vuelva a introducirla:");
            //Esto sirve para "modificar el contenido de la variable en este caso de contra2"
            contra2 = entrada.nextLine();

        }
        System.out.println("Verificacion completada");
    }
    public void ejer2 (){
        System.out.println("Introduce un numero");
        int num1 = entrada.nextInt();

        while (num1 > 1){
            num1 --;
            System.out.println(num1);
        }
    }
    public void ejer3 (){
        for (int i = 1; i <= 50; i++){
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public void ejer4 (){
        System.out.println("Introduce una cadena");
        String cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            System.out.println(caracter);
        }
    }
    public void ejer5 (){
        System.out.println("Introduce un numero para mostrar tabla de multiplicar");
        int num1 = entrada.nextInt();


        for (int i = 1; i <= 10; i++ ){
            int resultado= num1 * i;
            System.out.println(num1 + "*" + i + "=" + resultado);

        }
    }

}

