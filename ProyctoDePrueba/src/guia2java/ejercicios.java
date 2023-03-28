package guia2java;

import java.util.Scanner;

public class ejercicios {
    
    public static void main(String[] args) {
        
        
    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
    El programa deberá después mostrar el resultado de la suma */
       
    int nro1, nro2, suma;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el primer nro");
    nro1=entrada.nextInt();
    System.out.println("Ingrese el segundo nro");
    nro2=entrada.nextInt();
    suma= nro1 + nro2;
    System.out.println("La suma de los nros resulta: " + suma);
    
    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    
    Scanner entrada2 = new Scanner(System.in);
    String nombre;
    System.out.println("Ingrese su nombre ");
    nombre=entrada2.next();
    System.out.println("Hola "+nombre+" ,Bienvenida!");
    
    
    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
    
    Scanner entrada3 = new Scanner(System.in);
    String frase;
    System.out.println("Ingrese una frase ");
    frase = entrada3.nextLine();
    
    System.out.println("La frase ingresada es " + frase.toUpperCase());
    System.out.println("La frase ingresada es " + frase.toLowerCase());
    
    
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
    La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    
    
    Scanner entrada4= new Scanner(System.in);
    double Ct,F;
    System.out.println("Ingrese los grados Celcius");
    Ct=entrada4.nextDouble();
    F= 32 + (9 *Ct/5);
    System.out.println("El equivalente en Grados Fahrenheit es: " + F);
    
    
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
    el triple y la raíz cuadrada de ese número. 
    Nota: investigar la función Math.sqrt().*/
    
    Scanner entrada5= new Scanner(System.in);
    double num,doble,triple,raiz;
    System.out.println("Ingrese un nro ");
    num=entrada5.nextDouble();
    doble= num*2;
    triple= num*3;
    raiz= Math.sqrt(num);
    System.out.println("El doble del nro es: "+ doble+" El triple es: "+triple+" La raíz cuadrada es: "+raiz);
            
    }   
    
}
