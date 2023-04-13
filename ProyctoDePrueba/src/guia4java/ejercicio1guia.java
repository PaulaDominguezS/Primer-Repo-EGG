/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4java;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class ejercicio1guia {
    
    public static void main(String[] args) {
        
        
        /*Crea una aplicación que le pida dos números al usuario y este pueda
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main. */
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int nro1,nro2,s,r,m,d;
        String resp;
        System.out.println("Ingrese el 1er nro"); 
        nro1=entrada.nextInt();
        System.out.println("Ingrese el 2do nro"); 
        nro2=entrada.nextInt();  
        System.out.println("Ingrese la operación que desea realizar: ");
        resp=entrada.next();
        
        
        switch (resp) {
            case "s":
                 s=sumar(nro1, nro2);
                 System.out.println("El resultado es: "+ s);
                 break;
            case "r":
                 r=restar(nro1, nro2);
                 System.out.println("El resultado es: "+ r);
                 break;
            case "d":
                 d=dividir(nro1, nro2);
                 System.out.println("El resultado es: "+ d);
                 break;
            case "m":
                 m=multiplicar(nro1, nro2);
                 System.out.println("El resultado es: "+ m);
                 break;
            default:
                System.out.println("No es una operación válida.");
        }
        
        
    }   
    
    public static int sumar (int nro1,int nro2) {
        int suma= nro1+nro2;
        return suma;
    }
    
     public static int restar (int nro1,int nro2) {
        int resta= nro1-nro2;
        return resta;
    }
     public static int multiplicar (int nro1,int nro2) {
        int multi= nro1*nro2;
        return multi;
    }
     public static int dividir (int nro1,int nro2) {
        int div= nro1/nro2;
        return div;
    }
    
}
