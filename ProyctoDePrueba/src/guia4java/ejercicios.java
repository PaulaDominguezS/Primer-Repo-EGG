package guia4java;

import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {

        /*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
en la tabla y el resto de los caracteres (incluyendo a las vocales 
acentuadas) se mantienen sin cambios.
aeiou
@#$%*
Realice un subprograma que reciba una secuencia de caracteres y retorne la 
    codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
         */
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String palabra;

        do {
            System.out.println("Ingrese secuencia de caracteres que termine en punto.");
            palabra = entrada.next();
        } while (!palabra.endsWith("."));

        palabra = reemplazo(palabra);
        System.out.println("La frase reemplazada queda como:" + palabra);
    }

    public static String reemplazo(String palabra) {
        String aux = "";

        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "A":
                case "a":
                    aux = aux.concat("@");
                    break;
                case "E":
                case "e":
                    aux = aux.concat("#");
                    break;
                case "I":
                case "i":
                    aux = aux.concat("$");
                    break;
                case "O":
                case "o":
                    aux = aux.concat("%");
                    break;
                case "U":
                case "u":
                    aux = aux.concat("*");
                    break;
                default:
                    aux += palabra.substring(i, i + 1);
            }
        }
        return aux;
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
    el usuario, validando que el primer número múltiplo del segundo e imprima 
    si el primer número es múltiplo del segundo, sino informe que no lo son.*/

      
    }
}
