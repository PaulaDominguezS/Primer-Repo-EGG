package guia5java;

import java.util.Scanner;

public class ExtraEjercicio1 {

    public static void main(String[] args) {

        /*Realizar un algoritmo que calcule la suma de todos los elementos de 
        un vector de tamaño N, con los valores ingresados por el usuario.*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int n, nros, suma;
        suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        n = entrada.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los valores para el vector");
            nros = entrada.nextInt();
            vector[i] = nros;
            suma = suma + nros;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("LA suma de los elementos ingresados al vector es: " + suma);

    }
}
