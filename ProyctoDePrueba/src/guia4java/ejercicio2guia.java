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
public class ejercicio2guia {
    public static void main(String[] args) {

        /*Diseñe una función que pida el nombre y la edad de N personas e imprima 
    los datos de las personas ingresadas por teclado e indique si son mayores 
    o menores de edad. Después de cada persona, el programa debe preguntarle al
    usuario si quiere seguir mostrando personas y frenar cuando el usuario 
    ingrese la palabra “No”.*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String resp;
        datos();
        
    }

    public static void datos() {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        int edad;
        String nombre,resp;
        
        do {
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.next();
            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();
            if (edad > 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }
            System.out.println("Desea continuar?");
            resp=entrada.next();
        }while(resp.equals("s"));
        
    }
}
    

