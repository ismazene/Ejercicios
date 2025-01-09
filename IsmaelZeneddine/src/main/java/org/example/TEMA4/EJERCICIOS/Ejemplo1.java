package org.example.TEMA4.EJERCICIOS;

public class Ejemplo1 {
    public static void Ejer1(int contB, int contA, int n) {

        if (contB < contA) {
            System.out.print("* ");
            Ejer1(contB + 1, contA, n);
        } else {
            System.out.println();
            if (contA < n)
                Ejer1(0, contA + 1, n);
        }
    }
    public static void main(String[] args) {
        int altura = 3;
        Ejer1(0, 0, altura);
    }

}

