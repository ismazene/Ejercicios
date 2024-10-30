package org.example.TEMA2;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PRACTICAST2 {
    Scanner entrada = new Scanner(System.in);

    public void practica1() {

        try {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
            String fecha = entrada.nextLine();

            // Verificar las posiciones de las barras
            if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                System.out.println("Error: El formato de la fecha debe ser dd/mm/aaaa y no puede ser numeros negativos.");
                return;
            }
            // Extraer los componentes con los que vamos a trabajar de la fecha
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

    public void practica2() {

        try {
            // Dar la bienvenida al usuario
            System.out.println("BIENVENIDO A LA CALCULADORA RÁPIDA");

            // Pedir el primer numero, si no es un nummero salta el else
            System.out.println("Introduce el primer operando:");
            int num1;
            if (entrada.hasNextInt()) {
                num1 = entrada.nextInt();
            } else {
                System.out.println("Error: Entrada inválida. Por favor, introduce un número entero.");
                //Nos saca del programa con el return
                return;
            }

            entrada.nextLine();

            // Pedir el signo de la operación
            System.out.println("Introduce el signo a aplicar (+,-,/,x,R):");
            // Convertir el signo a mayúsculas
            String signo = entrada.nextLine().toUpperCase();

            // Verificar si es la raíz cuadrada
            if (signo.equals("R")) {
                // Calcular la raíz cuadrada solo del primer número
                if (num1 < 0) {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                } else {
                    double raiz_cuadrada = Math.sqrt(num1);
                    System.out.println("La raíz cuadrada de " + num1 + " es: " + raiz_cuadrada);
                }
            } else {
                // Pedir el segundo numero si no es raíz cuadrada
                System.out.println("Introduce el segundo operando:");
                int num2;
                //Verificacion de que es un numero como con el num1
                if (entrada.hasNextInt()) {
                    num2 = entrada.nextInt();
                } else {
                    System.out.println("Error: Entrada inválida. Por favor, introduce un número entero.");
                    return;
                }

                // Switch con todas las operaciones
                switch (signo) {
                    case "+":
                        int resultado_suma = num1 + num2;
                        System.out.println("Resultado de la suma: " + resultado_suma);
                        break;
                    case "-":
                        int resultado_resta = num1 - num2;
                        System.out.println("Resultado de la resta: " + resultado_resta);
                        break;
                    case "/":
                        if (num2 != 0) {
                            int resultado_div = num1 / num2;
                            System.out.println("Resultado de la división: " + resultado_div);
                        } else {
                            System.out.println("Error: No se puede dividir entre 0.");
                        }
                        break;
                    case "X": // Manejo de la multiplicación con "x" o "X"
                        int resultado_multi = num1 * num2;
                        System.out.println("Resultado de la multiplicación: " + resultado_multi);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Por favor, introduce números enteros.");
        }
    }

    public void practica3() {
        // Introucir el ISBN
        System.out.println("Introduce el ISBN de 10 dígitos:");
        try {
            // Leer el ISBN
            String isbnEntrada = entrada.nextLine();
            //Definir variables
            int factorMultiplicador = 10;
            int sumaTotal = 0;
            // Definir el símbolo de interrogación
            String signoInterrogacion = "?";

            // Verifica si la longitud del ISBN
            if (isbnEntrada.length() != 10) {
                // Si no es de 10 mensjae de error
                System.out.println("Error: El ISBN debe tener exactamente 10 dígitos.");
            } else {
                // Buscar ? en el ISBN
                int Signo = isbnEntrada.indexOf(signoInterrogacion);
                // Ver si hay una X en otro sitio que no sea al final
                int indexX = isbnEntrada.indexOf('X');

                if (indexX != -1 && indexX != 9) {
                    System.out.println("Error: La 'X' debe estar en la última posición.");
                } else {
                    // Si encuentra un signo
                    if (Signo != -1) {
                        for (int i = 0; i <= 10; i++) {
                            String reemplazo;
                            if (i == 10) {
                                reemplazo = "X";
                            } else {
                                reemplazo = String.valueOf(i);
                            }

                            // Reemplaza el signo de ? en el ISBN por el numero que corresponda
                            String pruebaISBN = isbnEntrada.substring(0, Signo) + reemplazo + isbnEntrada.substring(Signo + 1);

                            sumaTotal = 0;
                            factorMultiplicador = 10;

                            // Recorre los 10 caracteres del ISBN para calcular la suma
                            for (int j = 0; j < 10; j++) {
                                char digitoActual = pruebaISBN.charAt(j);
                                int digito;
                                if (digitoActual == 'X') {
                                    digito = 10;
                                } else {
                                    digito = Integer.parseInt(String.valueOf(digitoActual));
                                }
                                sumaTotal += digito * factorMultiplicador;
                                factorMultiplicador--;
                            }

                            // Divisible por 11
                            if (sumaTotal % 11 == 0) {
                                System.out.println("El ISBN es válido cuando ? es reemplazado por: " + reemplazo);
                            }
                        }
                    } else {
                        // Si no hay un signo ? hace el ISBN directamente
                        sumaTotal = 0;
                        factorMultiplicador = 10;

                        // Recorre los 10 caracteres del ISBN para calcular la suma
                        for (int j = 0; j < 10; j++) {
                            char digitoActual = isbnEntrada.charAt(j);
                            int digito;
                            if (digitoActual == 'X') {
                                digito = 10;
                            } else {
                                digito = Integer.parseInt(String.valueOf(digitoActual));
                            }
                            sumaTotal += digito * factorMultiplicador;
                            factorMultiplicador--;
                        }

                        // Divisible por 11
                        if (sumaTotal % 11 == 0) {
                            // Si es divisible
                            System.out.println("El ISBN es válido");
                        } else {
                            // Si no es divisible
                            System.out.println("El ISBN no es válido");
                        }
                    }
                }
            }

            // Excepciones
        } catch (NumberFormatException er) {
            // Mostrar mensaje de error
            System.out.println("Debes introducir exactamente 10 dígitos");
        }
    }
}

