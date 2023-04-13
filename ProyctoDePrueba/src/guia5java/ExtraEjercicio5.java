
package guia5java;

import java.util.Scanner;

public class ExtraEjercicio5 {
    
    public static void main(String[] args) {
        
        /*Realizar un programa que llene una matriz de tamaño NxM con valores 
        aleatorios y muestre la suma de sus elementos.*/
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int fila,columna;
        int min=5;
        int max= 9;
        int suma=0;
        System.out.println("Ingrese tamaño de las filas de matriz: ");
        fila=entrada.nextInt();
        System.out.println("Ingrese el tamaño de las columnas: ");
        columna=entrada.nextInt();
        int [][] matriz = new int [fila][columna];

        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j]= min+(int) (Math.random()*((max-min)+1));
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los elementos de la matriz es: "+suma);
    }
}
