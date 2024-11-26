package org.example.TEMA3;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosT3 {
    Scanner teclado = new Scanner(System.in);
    Random aleatorio = new Random();

    public void ejer1() {
        Random aleatorio = new Random();
        int numeros[] = new int[10];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = aleatorio.nextInt(501);
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es = " + suma);
    }

    public void ejer2() {
        int numeros[] = new int[5];
        System.out.println("Introduce los numeros a invertir");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(" " + numeros[i] + " ");
        }
    }

    public void ejer3() {
        Random aleatorio = new Random();
        int numeros[] = new int[25];
        int num = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(101);
        }
        System.out.println("Ingresa un numero del 0 al 100: ");
        num = teclado.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[1]) {
                contador++;
            }
        }
        System.out.println("El numero " + num + " aparece " + contador + " veces en el array ");
    }

    public void ejer5() {
        int numeros[] = {3, 5, 2, 1, 4};
        int ultima_posicion = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultima_posicion;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
    }

    public void eliminarDuplicados() {
        int vector1[] = {1, 1, 6, 7, 8, 8, 10, 15, 15};
        int vectorAux[] = new int[vector1.length];
        ;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] == vector1[i + 1]) ;
            else {
                vectorAux[i] = vector1[i];
            }
        }
    }

    public void triangulo() {
        int altura = teclado.nextInt();

        for (int i = altura; i >= 1; i--) {
            for (int j = altura; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void tablasMultiplicar() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }

    public void ejer1buscarMatrices() {
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Introduce el número que deseas buscar en la matriz:");
        int numeroBuscar = teclado.nextInt();
        boolean existe = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBuscar) {
                    System.out.println("El número " + numeroBuscar + " se encuentra en la posición [" + i + "][" + j + "]");
                    existe = false;
                }
            }
        }
        if (existe) {
            System.out.println("El numero introducido no existe");
        }
    }

    public void ejer2Matrices() {

                // Generar tamaño aleatorio para la matriz
                int filas = aleatorio.nextInt(10) + 1;  // Máximo 10 filas
                int columnas = aleatorio.nextInt(10) + 1;  // Máximo 10 columnas

                int[][] matriz = new int[filas][columnas];

                // Llenar la matriz con valores aleatorios entre 1 y 50
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matriz[i][j] = aleatorio.nextInt(50) + 1;
                    }
                }

                // Mostrar la matriz
                System.out.println("Matriz generada:");
                for (int[] fila : matriz) {
                    for (int columna : fila) {
                        System.out.print(columna + " ");
                    }
                    System.out.println();
                }

                // Calcular y mostrar la suma de las filas
                System.out.println("\nSuma de las filas:");
                for (int i = 0; i < filas; i++) {
                    int suma = 0;
                    for (int j = 0; j < columnas; j++) {
                        suma += matriz[i][j];
                    }
                    System.out.println("Fila " + (i + 1) + ": " + suma);
                }

                // Calcular y mostrar la suma de las columnas
                System.out.println("\nSuma de las columnas:");
                for (int j = 0; j < columnas; j++) {
                    int suma = 0;
                    for (int i = 0; i < filas; i++) {
                        suma += matriz[i][j];
                    }
                    System.out.println("Columna " + (j + 1) + ": " + suma);
                }
            }

    public void ejer3Matrices(){
        System.out.println("Cuantos alumnos tienes:");
        int estudiantes = teclado.nextInt();
        System.out.println("Cuantas asignaturas hay?");
        int asignaturas = teclado.nextInt();

        String tabla[][] = new String[estudiantes +1][asignaturas +1];
        tabla[0][0]= "Estudiantes";

        for (int i = 1; i < tabla.length; i++) {
            System.out.println("Inserta el nombre del alumno: " + i);
            tabla[i][0] = teclado.next();

        }
        for (int i = 1; i < tabla[0].length ; i++) {
            System.out.println("Insert ael nombre de la asignatura: " + i);
            tabla[0][i]=teclado.next();

        }
        for (int i = 1; i < tabla.length ; i++) {
            for (int j = 1; j < tabla[i].length; i++){
                tabla[i][j]= Integer.toString(teclado.nextInt());

            }

        }
    }

    public  void extra(){
        int filasA = teclado.nextInt();
        int columnasA = teclado.nextInt();;
        int tamanyoA = teclado.nextInt();
        int matrizA[][] = new int[filasA][columnasA];
        //---------------------------------------------------\\
        int filasB = teclado.nextInt();
        int columnasB = teclado.nextInt();;
        int tamanyoB = teclado.nextInt();
        int matrizB[][] = new int[filasA][columnasA];

        System.out.println("Dime cuantos numeros de filas quieres para la matriz A:");
        System.out.println("Dime el numero de columnas que quieres para la matriz A:");
        System.out.println("Dame el tamaño de la matriz A");
        //---------------------------------------------------\\
        System.out.println("Dime cuantos numeros de filas quieres para la matriz B:");
        System.out.println("Dime el numero de columnas que quieres para la mtariz B:");
        System.out.println("Dame el tamaño de la matriz B");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {

                if (matrizA[i][j] >= matrizB[i][j]){
                    System.out.println("Hola");
                } else if (matrizA[i][j] <= matrizB[i][j]) {

                } else {

                }

            }

        }
    }

}
