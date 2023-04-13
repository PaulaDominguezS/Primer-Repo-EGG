
package guia4java;

import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        
        
          Scanner entrada2 = new Scanner(System.in).useDelimiter("\n");
        int n1, n2;
        System.out.println("Ingrese el 1er nro");
        n1 = entrada2.nextInt();
        System.out.println("Ingrese el 2do nro");
        n2 = entrada2.nextInt();
        boolean m = EsMultiplo(n1, n2);

    }

    public static boolean EsMultiplo(int v1, int v2) {
        boolean r;

        if (v1 % v2 == 0) {
            r = true;
            System.out.println("El primer nro es multiplo del 2do nro");
        } else {
            r = false;
            System.out.println("El primer nro NO es multiplo del 2do nro");
        }
        return r;

    }
}
