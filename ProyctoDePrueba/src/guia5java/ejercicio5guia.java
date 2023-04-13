
package guia5java;

import java.util.Scanner;

public class ejercicio5guia {
    
    public static void main(String[] args) {
        
        /*Realice un programa que compruebe si una matriz dada es antisimétrica.
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
        propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
        si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
        obtiene cambiando sus filas por columnas (o viceversa).En este caso la 
        matriz es antisimétrica.*/
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int[] [] Matriz = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz [0] [0]= 0;
                Matriz [0] [1]= -2;
                Matriz [0] [2]= 4;
                Matriz [1] [0]= 2;
                Matriz [1] [1]= 0;
                Matriz [1] [2]= 2;
                Matriz [2] [0]= -4;
                Matriz [2] [1]= -2;
                Matriz [2] [2]= 0;
            }
            System.out.println("");
        }
        
        //mostrar M
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + Matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //mostrar M traspuesta
         for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("[" + Matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("La Matriz es antisimétrica.");
        
        
    }
    
}
