
package guia3java;

import java.util.Scanner;

public class Practicar {
    
    public static void main(String[] args) {
        
  
    /*Dado un tiempo en minutos, calcular su equivalente en días y horas.
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular
    su equivalente: 1 día, 2 horas.*/
    
    
    Scanner entrada = new Scanner(System.in);
    
    int hora,min,rmin,dia,mhora;
    
    
    System.out.println("Ingrese la cantidad de minutos");
    min=entrada.nextInt();
    
    hora=(min/60);
    rmin=min%60;
    dia=hora/24;
    mhora=hora%24;

    System.out.println("Su equivalente en dias es: "+dia+" en horas: "+mhora+" minutos: "+rmin);
        
    
    }
}
