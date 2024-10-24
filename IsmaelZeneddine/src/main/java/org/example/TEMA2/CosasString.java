package org.example.TEMA2;

public class CosasString {
    public void caracteres() {
        String frase = "Me porto mal en clase y no lo reconozco";

        //VERIFICAR ENTRADA DEL USUARIO
        int tamanyo = frase.length();
        System.out.println("El tamaño de mi frase es " + tamanyo);

        char letra = frase.charAt(33);
        System.out.println("La letra en la posicion 33 es " + letra);

        String palabra = frase.substring(9, 13);
        System.out.println("La palabra con substring es " + palabra);

        String palabra2 = "Parte.";
        String concatenacion = frase.concat(palabra2);
        System.out.println("La concatenacion de la frase con la palabra es " + palabra2 + "es " + concatenacion);

        int posicion = concatenacion.indexOf(palabra2);
        System.out.println("La palabra " + palabra2 + posicion + " esta en la posicion " + posicion);

        int posicion2 = concatenacion.indexOf("no", 8);
        System.out.println("posicion2 = " + posicion2);

        int posicion3 = concatenacion.indexOf("no");
        System.out.println("La posicion de la utima aparicion de la palabra es" + posicion3);

        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toUpperCase();
        System.out.println("La frase mayuscula es " + mayusculas + " y la frase minuscula es" + minusculas);

        String nombre = "Ismael";
        nombre = nombre.trim();
        System.out.println("Tu nombre sin espacios es " + nombre);

        String remplazar = frase.replace("mal", "bien");
        System.out.println("La frase " + frase + " queda asi " + remplazar);

        String palabra3 = "hola";
        String palabra4 = "hola";
        if (palabra3.equals(palabra4)) ;
            System.out.println("Son iguales");
            
        }
        }