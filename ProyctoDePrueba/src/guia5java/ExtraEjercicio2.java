package guia5java;

import java.util.Scanner;

public class ExtraEjercicio2 {

    public static void main(String[] args) {

        /*Escriba un programa que averigüe si dos vectores de N enteros son
        iguales (la comparación deberá detenerse en cuanto se detecte alguna
        diferencia entre los elementos).*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int t, n;
        boolean igualdad = true;
        System.out.println("Ingrese el tamaño de los vectores");
        t = entrada.nextInt();
        int[] vector1 = new int[t];
        int[] vector2 = new int[t];

        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese los nros para el vector1");
            n = entrada.nextInt();
            System.out.println("Ingrese los nros para el vector2");
            n = entrada.nextInt();
        }


        for (int i = 0; i < vector2.length; i++) {
            if (vector1[i] != vector2[i]) {
                igualdad = false;
                System.out.println("Los vectores son distintos");
                break;
            }
        }

        if (igualdad) {
            System.out.println("Los vectores son iguales!");
        }
    }
}
