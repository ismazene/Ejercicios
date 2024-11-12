package org.example.TEMA3;
import java.util.Random;
import java.util.Scanner;

public class PRACTICAST3 {
    Scanner teclado = new Scanner(System.in);
    Random aleatorio = new Random();

    public void practica1() {

        //Declaramos todas las variables
        int maxPotencia = 30;
        int suma;
        int[] potenciasEquipo1 = new int[7];
        int[] potenciasEquipo2 = new int[7];
        int bajasEquipo1 = 0;
        int bajasEquipo2 = 0;

        try {
            System.out.println("EQUIPO 1!!!");
            // Bucle hasta que se ingrese un equipo válido
            while (true) {
                suma = 0;  // Reinicia la suma
                System.out.println("Introduce la potencia de los 7 samurais (separados por un espacio): ");
                String potencias1 = teclado.nextLine();
                String[] potenciasSplit1 = potencias1.split(" ");  //Dividimos la entrada de las potencias por espacios

                //Verificamos que se ingresan 7 potencias, 1 por cada samurai
                if (potenciasSplit1.length != 7) {
                    System.out.println("ERROR: Debes introducir exactamente 7 números.");
                    continue;  // Reintentamos si no son 7 los valores introducidos
                }

                //He declarado la variable i fuera del for porque necesito la variable i para el if que va despues
                //si la declaro dentro se limita solamente a utilizarse dentro del bucle for, sirve para verificar que hay 7 samurais
                int i;
                for (i = 0; i < potenciasSplit1.length; i++) {
                    try {
                        int potencia = Integer.parseInt(potenciasSplit1[i]);  //Convierte la entrada a entero
                        //Verificamos que cada potencia este entre 1 y 24
                        if (potencia < 1 || potencia > 24) {
                            System.out.println("ERROR: Cada samurái debe tener una potencia entre 1 y 24.");
                            break;  //Sale del bucle si encuentra una potencia fuera del rango
                        }
                        potenciasEquipo1[i] = potencia;  //Almacenamos la potencia en el array
                        suma += potencia;  //Suma todas las potencias
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: Debes introducir únicamente números.");
                        break;  //Sale del bucle si no ponemos todo numeros
                    }
                }

                //Comprobamos que los numeros son 7 y que la suma total da 30 si no es asi salta el else if
                if (i == 7 && suma == maxPotencia) {
                    System.out.println("Equipo 1 completado");
                    break;
                } else if (i == 7) {
                    System.out.println("ERROR: La potencia total no suma 30. Inténtalo de nuevo.");
                }
            }

            //Hacemos lo mismo en el segundo equipo que en el primero
            System.out.println("EQUIPO 2!!!");
            while (true) {
                suma = 0;
                System.out.println("Introduce la potencia de los 7 samurais (separados por un espacio): ");
                String potencias2 = teclado.nextLine();
                String[] potenciasSplit2 = potencias2.split(" ");

                if (potenciasSplit2.length != 7) {
                    System.out.println("ERROR: Debes introducir exactamente 7 números.");
                    continue;
                }

                int i;
                for (i = 0; i < potenciasSplit2.length; i++) {
                    try {
                        int potencia = Integer.parseInt(potenciasSplit2[i]);
                        if (potencia < 1 || potencia > 24) {
                            System.out.println("ERROR: Cada samurái debe tener una potencia entre 1 y 24.");
                            break;
                        }
                        potenciasEquipo2[i] = potencia;
                        suma += potencia;
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: Debes introducir únicamente números.");
                        break;
                    }
                }

                if (i == 7 && suma == maxPotencia) {
                    System.out.println("Equipo 2 completado");
                    break;
                } else if (i == 7) {
                    System.out.println("ERROR: La potencia total no suma 30. Inténtalo de nuevo.");
                }
            }

            // Inicia la batalla entre los dos equipos
            System.out.println("¡Empieza la batalla!");

            int primerSamurai = aleatorio.nextInt(7); //Utilizamos un numero random para saber quien va a comenzar
            System.out.println("La batalla inicia con el Samurai " + (primerSamurai + 1) + ".");

            //Bucle para las peleas de cada samurai
            for (int i = 0; i < 7; i++) {
                int peleaActual = (primerSamurai + i) % 7;  // Determina qué samuráis pelearán en esta ronda

                //Esto sirve paratener un segundo de retraso cada vez que se muestre por pantalla quien gana, no me funciona fuera del try-catch
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                //Ahora solo queda mostrar quin gana y apuntarse las bajas y controlamos que 2 samurais tengan la misma potencia
                System.out.print("Samurai " + (peleaActual + 1) + ". ");
                if (potenciasEquipo1[peleaActual] > potenciasEquipo2[peleaActual]) {
                    //Si el samurái del equipo 1 tiene más potencia gana
                    System.out.println("Gana Equipo 1. " + potenciasEquipo1[peleaActual] + " vs " + potenciasEquipo2[peleaActual]);
                    bajasEquipo2++; //Con esta linea sumammos las lineas de cada equipo para despues mostrarlas
                } else if (potenciasEquipo1[peleaActual] < potenciasEquipo2[peleaActual]) {
                    // Si el samurái del equipo 2 tiene más potencia, gana y se registra una baja en el equipo 1
                    System.out.println("Gana Equipo 2. " + potenciasEquipo1[peleaActual] + " vs " + potenciasEquipo2[peleaActual]);
                    bajasEquipo1++;
                } else {
                    // Si ambos samuráis tienen la misma potencia, hay un empate
                    System.out.println("¡Es un empate! " + potenciasEquipo1[peleaActual] + " vs " + potenciasEquipo2[peleaActual]);
                }
            }

            // Determina el equipo ganador según el número de bajas sufridas
            if (bajasEquipo1 < bajasEquipo2) {
                System.out.println("¡Equipo 1 GANA! Equipo 1 ha tenido " + bajasEquipo1 + " bajas.");
            } else if (bajasEquipo1 > bajasEquipo2) {
                System.out.println("¡Equipo 2 GANA! Equipo 2 ha tenido " + bajasEquipo2 + " bajas.");
            } else {
                System.out.println("¡Es un empate!");
            }
        } catch (NumberFormatException er) {
            // Manejo de errores en caso de que la entrada no sea numérica
            System.out.println("Error: Debes introducir únicamente números.");
        }
    }
}