
package guia5java;

import java.util.Scanner;

public class ExtraEjercicio3 {
    
    public static void main(String[] args) {
        
        /*Crear una función rellene un vector con números aleatorios, pasándole 
        un arreglo por parámetro. Después haremos otra función o procedimiento
        que imprima el vector.*/
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int [] vector = new int [5];
        llenar(vector);
        mostrar(vector);
        
    }
    public static void llenar (int[] vector) {
        for (int i = 0; i < 5; i++) {
            vector[i]= (int)(Math.random()*10);
        }
    }
    
    public static void mostrar(int[] vector) {
        for (int i = 0; i < 5; i++) {
            System.out.print("["+vector[i]+"]");
            
        }
    }
}

