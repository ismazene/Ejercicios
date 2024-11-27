package org.example.TEMA3;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


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

    public void practica2() {
        String colores[] = {"rojo", "negro"};
        Integer numerosRuleta[] = new Integer[37];
        for (int i = 0; i < numerosRuleta.length; i++) {
            numerosRuleta[i] = i;
        }
        String pares[] = {"par", "impar"};
        System.out.println("Número (0-36)");
        int numero = teclado.nextInt();

        boolean numero_existe = Arrays.asList(numerosRuleta).contains(numero);

        if (!numero_existe) {
            System.out.println("Error:El numero no es valido");
            return;
        } else {
            System.out.println("Color (rojo,negro): ");
            String color = teclado.next();

            boolean color_existe = Arrays.asList(colores).contains(color);
            if (color_existe) {
                System.out.println("Introduce la opcion par o impar: ");
                String par = teclado.nextLine();

                boolean par_existe = Arrays.asList(pares).contains(par);

                if (!par_existe) {
                    System.out.println("ERROR:La opcion par/impar no es valida");
                    return;
                }
            }
        }
        int numero_sorteo = numerosRuleta[aleatorio.nextInt(37)];
        String color_sorteo = colores[aleatorio.nextInt(2)];
        String pares_sorteo = "";
        if (numero_sorteo % 2 == 0) {
            pares_sorteo = "par";
        } else {
            pares_sorteo = "impar";
        }
        System.out.println("Ha tocado otra cosa");
        if (numero != 0 && numero_sorteo == numero && color_sorteo.equals(colores) && pares_sorteo.equals(pares)) {
            System.out.println("HAS GANADO OLE OLE OLE");
        } else if (numero != 0 && color_sorteo.equals(colores)) {
            System.out.println("HAS ACERTADO EL COLOR!!!");
        } else if (numero != 0 && pares_sorteo.equals(pares)) {
            System.out.println("HAS ACERTADO LA OPCION PAR/IMPAR!!!!");
        } else if (numero == numero_sorteo && numero != 0) {
            System.out.println("HAS ACERTADO EL NUMERO");
        } else if (numero == 0 && numero_sorteo == 0) {
            System.out.println("Has perido ;((");
        }
    }

    public void practica3() {

        // Solicitar los numeros del boleto
        System.out.println("Introduce los datos de tu boleto:");
        String numerosBoleto = teclado.nextLine();

        // Validar el formato de entrada
        if (numerosBoleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}")) {
            String[] numeros = numerosBoleto.split("[-/]");

            // Validamos que los 6 números estén en el rango
            for (int i = 0; i < 6; i++) {
                // Convertimos cada número a entero
                int valor = Integer.parseInt(numeros[i]);
                if (valor < 1 || valor > 49) {
                    System.out.println("Error: Números fuera de rango (1-49).");
                    // Terminamos si algún número no es válido
                    return;
                }
            }

            // Validamos que el número de reintegro esté en el rango
            int numeroReintegroBoleto = Integer.parseInt(numeros[6]);
            if (numeroReintegroBoleto < 0 || numeroReintegroBoleto > 9) {
                System.out.println("Error: Reintegro fuera de rango (0-9).");
                // Terminar si el reintegro no es valido
                return;
            }
            // Ponemos por pantalla que el boleto es valido
            System.out.println("Boleto válido: " + numerosBoleto);

            // Creamos un vector para meter las bolas sorteadas
            int[] bolasSorteadas = new int[6];
            for (int i = 0; i < 6; i++) {
                // Generamos un número aleatorio entre 1 y 49
                int numero = aleatorio.nextInt(49) + 1;
                // Verificamos que el numeor ya haya salido para qu eno salga de nuevo
                for (int j = 0; j < i; j++) {
                    // Si el número ya existe
                    if (bolasSorteadas[j] == numero) {
                        // Generamos un número aleatorio entre 1 y 49
                        numero = aleatorio.nextInt(49) + 1;
                        // Reiniciamos la comprobacion
                        j = -1;
                    }
                }
                // Almacenamos el número en el vector
                bolasSorteadas[i] = numero;
            }

            // Ordenar las bolas sorteadas conm el algoritmo en burbuja como hemos visto en clase
            for (int i = 0; i < bolasSorteadas.length - 1; i++) {
                for (int j = i + 1; j < bolasSorteadas.length; j++) {
                    // Si los números están desordenados
                    if (bolasSorteadas[i] > bolasSorteadas[j]) {
                        // Intercambiamos las posiciones
                        int temp = bolasSorteadas[i];
                        bolasSorteadas[i] = bolasSorteadas[j];
                        bolasSorteadas[j] = temp;
                    }
                }
            }

            // Mostramos los numeros sorteados
            System.out.print("Bolas sorteadas: ");
            for (int i = 0; i < bolasSorteadas.length; i++) {
                if (i < bolasSorteadas.length - 1) {
                    System.out.print(bolasSorteadas[i] + ", ");
                } else {
                    System.out.print(bolasSorteadas[i] + "\n");
                }
            }

            // Generamos un número complementario entre el 1 y 49
            int numeroComplementario = aleatorio.nextInt(49) + 1;
            for (int i = 0; i < bolasSorteadas.length; i++) {
                // Si ya existe en las bolas sorteadas
                if (bolasSorteadas[i] == numeroComplementario) {
                    // Generamos un número aleatorio entre 1 y 49
                    numeroComplementario = aleatorio.nextInt(49) + 1;
                    i = -1; // Reiniciar la comprobación
                }
            }
            // Mostrar el número complementario
            System.out.println("Número complementario: " + numeroComplementario);

            // Generamos el número de reintegro
            int numeroReintegroSorteo = aleatorio.nextInt(10);
            System.out.println("Número de reintegro: " + numeroReintegroSorteo);

            // Hacemos un contador de aciertos
            int aciertos = 0;
            for (int i = 0; i < 6; i++) {
                int valorBoleto = Integer.parseInt(numeros[i]);
                // Comparamos con los numeros sorteados
                for (int j = 0; j < 6; j++) {
                    if (valorBoleto == bolasSorteadas[j]) {
                        aciertos++; // Incrementar el contador si hay coincidencia
                    }
                }
            }

            if (aciertos == 6 && numeroReintegroBoleto == numeroReintegroSorteo) {
                // 6 aciertos + reintegro
                System.out.println("¡Categoría Especial!");
            } else if (aciertos == 6) {
                // Solo 6 aciertos
                System.out.println("¡Primera categoría!");
            } else if (aciertos == 5 && numeroComplementario == Integer.parseInt(numeros[5])) {
                // 5 aciertos + complementario
                System.out.println("¡Segunda categoría!");
            } else if (aciertos == 5) {
                // Solo 5 aciertos
                System.out.println("¡Tercera categoría!");
            } else if (aciertos == 4) {
                // 4 aciertos
                System.out.println("¡Cuarta categoría!");
            } else if (aciertos == 3) {
                // 3 aciertos
                System.out.println("¡Quinta categoría!");
            } else if (numeroReintegroBoleto == numeroReintegroSorteo) {
                // Solo reintegro
                System.out.println("¡Reintegro!");
            } else {
                // Ningún premio
                System.out.println("No premiado");
            }

        } else {
            // Si el formato no es válido, mostramos un error
            System.out.println("Formato inválido ( x-x-x-x-x-x/R)");
        }
    }

    public void pracica4() {
        //Sopa de letras

        int filasSopa = 0;
        int columnasSopa = 0;
        boolean error = true;


        while (error) {
            try {
                System.out.println("Introduce el numero de filas:");
                filasSopa = teclado.nextInt();

                System.out.println("Introduce el numero de columnas:");
                columnasSopa = teclado.nextInt();

                error = false;

            } catch (Exception e) {
                System.err.println("Introduce valores validos");
                teclado.nextLine();
            }
        }

        // Crear la matriz para almacenar los caracteres
        String matriz[][] = new String[filasSopa][columnasSopa];

        // Rellenar la matriz fila por fila
        try {
            for (int i = 0; i < filasSopa; i++) {
                System.out.println("Introduce las letras de la fila " + (i + 1) + ":");
                String filas = teclado.next(); // Leer una cadena de letras

                // Verificar si la longitud de la cadena es igual al número de columnas
                if (filas.length() == columnasSopa) {
                    // Almacenar cada carácter de la cadena en la matriz
                    for (int j = 0; j < columnasSopa; j++) {
                        matriz[i][j] = String.valueOf(filas.charAt(j)); // Guardamos cada letra en la matriz
                    }
                } else {
                    // Si el número de caracteres no coincide con el número de columnas, repetimos la fila
                    System.err.println("Error: El número de caracteres en la fila no coincide con el número de columnas.");
                    i--;
                }
            }
        } catch (Exception e) {
            System.err.println("No has introducido letras");
        }

        // Imprimir la matriz final
        System.out.println("La sopa de letras es:");
        for (int i = 0; i < filasSopa; i++) {
            for (int j = 0; j < columnasSopa; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
