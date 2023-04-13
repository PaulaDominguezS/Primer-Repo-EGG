package guia5java;

import java.util.Scanner;

public class ejercicio1guia {

    public static void main(String[] args) {

        /*Realizar un algoritmo que llene un vector con los 100 primeros 
    números enteros y los muestre por pantalla en orden descendente.*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {

            num[i] = i + 1;
        }

        for (int i = num.length; i > 0; i--) {
            System.out.println("los nros son: " + i);
        }

    }

}
