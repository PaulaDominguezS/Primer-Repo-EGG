
package guia3java;

import java.util.Scanner;

public class ejercicios {
    
    public static void main(String[] args){
        
    //Crear un programa que dado un número determine si es par o impar.
        
        
        Scanner entrada = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese un nro");
        nro= entrada.nextInt();
        if (nro % 2==0) {
            System.out.println("El nro es par");
        }else {
            System.out.println("El nro es impar");
        }
    
    
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    el programa pondrá un mensaje de Correcto, 5sino mostrará un mensaje de 
    Incorrecto. Nota: investigar la función equals() en Java.*/
    
    
    Scanner entrada2 = new Scanner(System.in);
    String frase;
    System.out.println("ingrese frase");
    frase = entrada2.nextLine(); 
    while (!frase.equals("eureka")) {
      System.out.println("Reingrese frase");
        frase = entrada2.nextLine();
    }
     if (frase.equals("eureka")) {
      System.out.println("Correcto");
    }
     
        
    /*Realizar un programa que solo permita introducir solo frases o palabras 
    de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se 
    deberá  de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
    contrario, se deberá  imprimir “INCORRECTO”. Nota: investigar la funciónn
    Lenght() en Java.*/
     
    Scanner entrada3 = new Scanner(System.in);
    String palabra;
    do {
      System.out.println("Ingrese una palabra");
        palabra= entrada3.next();
    } while(palabra.length()!=8) ;{
        System.out.println("Correcto.");
    }        
       
    /*Escriba un programa que pida una frase o palabra y valide si la
    primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, 
    se deberá  de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
    contrario, se deberá  imprimir “INCORRECTO”. Nota: investigar la función 
    Substring y equals() de Java.*/
    
 
    Scanner entrada4 = new Scanner(System.in);
    String frase2;
    System.out.println("Ingrese frase o palabra");
    frase2= entrada4.next();
        if (frase2.substring(0,1).equals("A")) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    
    
    /*Escriba un programa en el cual se ingrese un valor liímite positivo, y a 
    continuaciónn solicite núúmeros al usuario hasta que la suma de los núúmeros 
    introducidos supere el límite inicial.*/
    
    Scanner entrada5 = new Scanner(System.in);
    int num,limite,suma;
    System.out.println("Ingrese un nro para el limite");
    limite= entrada5.nextInt();
    suma=0;
        do {            
            System.out.println("Ingrese nro");
            num=entrada5.nextInt();
            suma+=num;
        } while (suma<=limite);
            
    
    /*Realizar un programa que pida dos números enteros positivos por teclado
    y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
    opción y el programa deberá mostrar el resultado por pantalla y luego 
    volver al menú. El programa deberá ejecutarse hasta que se elija la 
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en 
    vez de salir del programa directamente, se debe mostrar el siguiente 
    mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
    contrario se vuelve a mostrar el menú.*/
    
    Scanner entrada6 = new Scanner(System.in);
    int n1,n2,opcion,s,r,m,d;
    String resp;
    Boolean salir= true;
    System.out.println("Ingrese 1er nro");
    n1=entrada6.nextInt();
    System.out.println("Ingrese 2do nro");
    n2=entrada6.nextInt();
    do {
    System.out.println("MENú: ");
    System.out.println("1)Sumar.");
    System.out.println("2)Restar");
    System.out.println("3)Multilicar");
    System.out.println("4)Dividir");
    System.out.println("5)Salir"); 
    System.out.println("Ingrese nro de opción: ");
    opcion=entrada6.nextInt();
        
        switch (opcion) {
            case 1:s=n1+n2;
                System.out.println("La suma de los nros es: "+s);
                break;
            case 2:r=n1-n2;
                System.out.println("La resta de los nros es: "+r);
                break;
            case 3:m=n1*n2;
                System.out.println("La multiplicación de los nros es:"+m);
                break;
            case 4:d=n1/n2;
                System.out.println("La división de los nros es: "+d);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa?: S/N");
                resp=entrada6.next();
                if (resp.equals("S")) {
                    salir=false;
                    break;
                }
                }     
    }while (salir);
        
    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232,
    este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
    deben llegar con un formato fijo: tienen que ser de un máximo de 5 
    caracteres de largo, el primer carácter tiene que ser X y el último tiene 
    que ser una O.Las secuencias leídas que respeten el formato se consideran 
    correctas, la secuencia especial “&&&&&” marca el final de los envíos 
    (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el 
    formato se considera incorrecta.Al finalizar el proceso, se imprime un 
    informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
    Para resolver el ejercicio deberá investigar cómo se utilizan las 
    siguientes funciones de Java Substring(), Length(), equals().*/
    
    Scanner entrada7 = new Scanner(System.in);
    String cadena;
    System.out.println("Ingrese una palabra");
    
    
    
    /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        lo siguiente:
            * * * *
            *     *
            *     *
            * * * *   */
    
     Scanner entrada8 = new Scanner(System.in);
        int elemento;
        System.out.println("Ingrese nro de elemento de lado del cuadrado");
        elemento=entrada8.nextInt();
        
        for (int i = 0; i < elemento; i++) {
            for (int j = 0; j < elemento; j++) {
                if (i>0 && i<elemento-1 && j>0 && j<elemento-1) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            } 
            System.out.println(" ");
        }
      
    }
}
