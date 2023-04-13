package guia4java;

import java.util.Scanner;

public class ejercicio4guia {

    public static void main(String[] args) {

        /*Crea una aplicación que nos pida un número por teclado y con una 
        función se lo pasamos por parámetro para que nos indique si es o no un 
        número primo, debe devolver true si es primo, sino false.Un número
        primo es aquel que solo puede dividirse entre 1 y sí mismo. 
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
        sin embargo, 17 si es primo.*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int nro;
        System.out.println("Ingrese un nro");
        nro = entrada.nextInt();
        num(nro);
        
    }

    public static boolean num(int nro) {
        boolean primo = true;
        int c;
        c=0;
        for (int i = 1; i <= nro; i++) {
            if (nro % i == 0) {
                c++;
            } 
            //System.ou.println("El número es primo");
            //System.out.println("El número NO es primo");
        }
        
         if (c>2) {
                System.out.println("El número NO es primo");
                primo=true;
            }else {
                System.out.println("El número es primo");
                primo=false;
         }
        return primo; 
    }
}