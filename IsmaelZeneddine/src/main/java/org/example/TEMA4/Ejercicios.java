package org.example.TEMA4;
import java.util.Scanner;

public class Ejercicios {
        public static void funcion(){
            Scanner teclado = new Scanner(System.in);
            int nBase = 1;
            System.out.println("Dame un numero");
            int num = teclado.nextInt();
            if (num > nBase){

                funcion();

            }else{
                //código
                return;
            }
        }
    }
