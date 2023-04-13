package guia5java;

import java.util.Scanner;

public class ejercicio4guia {

    public static void main(String[] args) {

        /*Realizar un programa que rellene un matriz de 4 x 4 de valores 
        aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta 
        de una matriz A se denota por B y se obtiene cambiando sus filas por
        columnas (o viceversa).*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int[][] Matriz = new int[4][4];
        //llenar M
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Matriz [i] [j]= (int)(Math.random() *10);
            }
        }
        //mostrar M con aleatorios

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + Matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        System.out.println("");

        //Mostrar M Traspuesta
        
         for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("[" + Matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        
    }
}
