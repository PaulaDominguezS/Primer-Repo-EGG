package guia2java;

import java.util.Scanner;

public class ClaseDePractica {
    //p s v m + tabulación
    //psvm
    public static void main(String[] args) {
        
        //Se crea una variable Scanner que se utiliza para leer datos de usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre; 
        //Muestra un mensaje por pantalla
        System.out.println("Ingrese su nombre: ");
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //Mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo, soy " + nombre + " y estoy programando en Java.");
        //f6 para Run
        //variable ue aloje mi nombre y edad
        String nomb = "PauD";
        int edad = 32;
        //imprimir ambas variables -- sout+tab
        System.out.println("Hola soy " + nomb + " y tengo " + edad + " años" );
        //El print sin el LN es para escribir sin salto de linea
        System.out.print("Hola ");
	System.out.println("Mundo"); // le pongo ln sino le pega lo siguiente

        //Pasar un nro a cadena 
        int numEntero = 3;
        String numCadena = String.valueOf(numEntero);
        //Pasar un cadena a un nro
        String nCadena = "7";
        int nEntero = Integer.parseInt(nCadena);
        //random es del 0 al 9
        int nEnt = (int) (Math.random() *10);
        
                
        
  
        
        //String es Cadena 
  	String nombre2 = "Sofia";
        System.out.println("mi nombre es : " + nombre2);
        //boolean es VoF
  	boolean bandera = true;
        System.out.println("bandera es " + bandera);
        //char tipo de caracter y se escribe entre comillas simples
        char ch =  'a';
        System.out.println("todavia no entiendo este " + ch);
        //crea variable int, que es un nro entero
        int numero = 8;
        System.out.println("el nro es " + numero);
        //crea variable double, que decimales Y SE SEPARAN CON " . "
        double decimales = 3.5;
        System.out.println(" este nro es : " + decimales);
        //crea byte, que es entero con el minimo valor hasta 127 
        byte nminimo = -4;
        System.out.println("esto es un byte " + nminimo);
        
        //Define variables donde puedas alojar los resultados y usar dos operadores de cada tipo.
        int n1 = 5;
        int n2 = 8; 
        int n3 = 4;
        int n4 = n1;
        System.out.println("los nros son: " +n1 +"," +n2 +"," +n3 + "," +n4);
        
        
        
        int suma = n3 + n2;
        int suma2 = n1 + n3;
        int resta1 = n2 - n3;
        int resta2 = n1 - n3;
        int multi1 = n2 * n3;
        int multi2 = n3 * n1;
        double div1 = n2 / n3;
        double div2 = n2 / n1;
        int mod1 = n1 % n2;
        int mod2 = n3 % n1;
        boolean mayor1 = n1 > n3;
        boolean menor2 = n2 < n1; 
        boolean igual = n4 == n1;
        boolean distinto = n3 != n2;
        boolean mayori = n1 >= n3;
        boolean menori = n3 <= n2;
        
        System.out.println("Ej: el resultado de : es: " + distinto);   
    }
}
