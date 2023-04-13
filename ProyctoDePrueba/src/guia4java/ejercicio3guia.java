
package guia4java;

import java.util.Scanner;

public class ejercicio3guia {

    public static void main(String[] args) {

        /*Crea una aplicación que a través de una función nos convierta una cantidad
    de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
    yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
    la moneda a convertir que será una cadena, este no devolverá ningún valor 
    y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        double euro;
        String resp;
        System.out.println("Ingrese la cantidad de euros: ");
        euro = entrada.nextInt();
        System.out.println("A qué moneda desea convertir: ");
        resp = entrada.next();

        cambiod(euro, resp);

    }

    public static void cambiod(double euro, String resp) {

        switch (resp) {
            case "dolar":
                euro *= 1.28611;
                break;
            case "libra":
                euro *= 0.86;
                break;
            case "yenes":
                euro *= 129.852;
        }
        System.out.println("Su cambio es: " + euro);

    }

}
