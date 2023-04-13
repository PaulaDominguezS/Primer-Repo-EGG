package guia5java;

import java.util.Scanner;

public class ejercicio6guia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[3][3];

        int suma, suma1 = 0;
        boolean filas=true, columnas=true, diagonal=true, dinversa = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do {
                    System.out.println("Ingrese nro para asignar a la posición; " + (i) + "," + (j) + " del vector");
                    matriz[i][j] = entrada.nextInt();
                    if (matriz[i][j] < 0 || matriz[i][j] > 9) {
                        System.out.println("Solo son válidos los nros entre 0 y 9");
                        System.out.println("");
                    }
                } while (matriz[i][j] < 0 || matriz[i][j] > 9);
            }
        }

        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
            if (i == 0) {
                suma1 = suma;
            } else if (suma != suma1) {
                filas = false;
            }
        }

        for (int j = 0; j < 3; j++) {
            suma = 0;
            for (int i = 0; i < 3; i++) {
                suma += matriz[j][i];
            }
            if (suma != suma1) {
                columnas = false;
            }
        }
        suma = 0;
        for (int i = 0; i < 3; i++) {
            int j = i;
            suma += matriz[i][j];
        }
        if (suma != suma1) {
            diagonal = false;
        }
        suma=0;
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][2 - i];
        }
        if (suma != suma1) {
            dinversa=false;
        }
            
        if (filas && columnas && diagonal && dinversa) {
            System.out.println("El cubo es mágico");
        }else {
            System.out.println("E cubo NO es mágico");
        }
    }
}
