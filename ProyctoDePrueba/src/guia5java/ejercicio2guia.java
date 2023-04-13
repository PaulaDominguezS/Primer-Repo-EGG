package guia5java;

import java.util.Scanner;

public class ejercicio2guia {

    public static void main(String[] args) {

        /*Realizar un algoritmo que llene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un número a buscar en el vector. El 
        programa mostrará dónde se encuentra el numero y si se encuentra repetido*/
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int n,x,c;
        c=0;
        System.out.println("Ingrese el tamaño del vector: ");
        n=entrada.nextInt();
        
        int [] vector = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*10);
        }
        
        System.out.println("Ingrese el nro que desea buscar en el vector");
        x=entrada.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i]==x) {
                System.out.println("El nro se encuentra en la posición : ["+i+"]");
                c++;
            }  
        }
        if (c>1) {
            System.out.println("El nro se encuentra repetido.");
        }
    }
}
