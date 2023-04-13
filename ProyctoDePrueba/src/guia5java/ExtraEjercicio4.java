
package guia5java;

import java.util.Scanner;

public class ExtraEjercicio4 {
    
    public static void main(String[] args) {
        
        /*Los profesores del curso de programación de Egg necesitan llevar un 
        registro de las notas adquiridas por sus 10 alumnos para luego obtener 
        una cantidad de aprobados y desaprobados. Durante el período de cursado 
        cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 
        por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el 
        arreglo. Al final del programa los profesores necesitan obtener por 
        pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta 
        que solo aprueban los alumnos con promedio mayor o igual al 7 de sus 
        notas del curso.*/
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        double [] vector = new double [10];
        double promedio;
        int dp=0;
        int ap=0;
        
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota: "+(j+1)+" del alumno: "+(i+1));
                vector[i]=entrada.nextDouble();
            }
            
            promedio=vector[i]/4;
            System.out.println("El promedio del alumno: "+(i+1)+",es: "+promedio);
            
            if (promedio>=7) {
                ap++;
            }else {
                dp++;
            }
        }
        System.out.println("");
         System.out.println("Aprobados: "+ap);
         System.out.println("Desaprobados: "+dp);
            
        
        
        
    }
}
