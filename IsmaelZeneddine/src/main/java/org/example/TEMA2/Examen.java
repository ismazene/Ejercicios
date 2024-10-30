package org.example;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;


public class Examen {
    Scanner entrada = new Scanner(System.in);

    public void ejercicio1 (){

        Random random = new Random();
        int aleatorio = random.nextInt(100) + 1;
        int numerointentos = 10;
        System.out.println(aleatorio);
        //Pedimos el numero
        System.out.println("Acabo de pensar un número [0-100]… ¿puedes adivinarlo? ¡Tienes 10 intentos!");

        //Hacemos un bucle para los 10 intentos y un try-catch para los errores
        try {
            for (int i = 1; i < 11 ; i++){
                //Preguntamos por el numero
                System.out.println("Intento." + i + " Introduce un número:");
                //Leemos el numero
                int numero = entrada.nextInt();
                //Si el numero es menor a 0 o mayor a 100 salta el error
                if (numero < 0 || numero > 100){
                    System.out.println("No puedes introducir numeros negativos ni mayores a 100");
                    break;
                } else {
                    //Si el numero es mayor lo pone
                    if (numero > aleatorio){
                        System.out.println("El numero es mayor al que he pesando");
                        //Si el numero es menor lo pone
                    }else if (numero < aleatorio){
                        System.out.println("El numero es menor al que he pensado");
                        //Si el numero es igual lo pone y sale del bucle
                    } else if (numero == aleatorio){
                        System.out.println("El numero introducido es el correcto");
                        break;
                    }
                }
            }
            //Decimos cual ha sido el numero
            System.out.println("El numero es " + aleatorio);
            //Controlamos las excepciones
        } catch (InputMismatchException er){
            System.out.println("Solo puedes introducir numeros");
        }


    }
    public void ejercicio2 (){
        //Vemos cual es nuestro año
        LocalDateTime hoy = LocalDateTime.now();
        int anyoActual = hoy.getYear();

        //Pedimos el año bisiesto que queremos calcular
        System.out.println("Introduce el año:");
        //Leemos el año
        int anyo = entrada.nextInt();

        //Intento de ejercicio
        try {
            if (anyo % 4 == 0 || anyo  % 100 != 0) {
                System.out.println("No es bisiesto");
            }
            // Excepciones
        } catch (NumberFormatException er) {
            // Mostrar mensaje de error
            System.out.println("Debes introducir exactamente 10 dígitos");
        }
    }
}
