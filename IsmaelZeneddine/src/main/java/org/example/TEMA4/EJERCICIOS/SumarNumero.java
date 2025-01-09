package org.example.TEMA4.EJERCICIOS;
import java.util.Scanner;


public class SumarNumero {
    public static int funcion(int num) {
        if (num==0) {
           return 0;

        } else {
            return num + funcion(num-1);
        }
    }

    public static void main(String[] args) {

        int num = 43;
        System.out.println(num);
    }
}

