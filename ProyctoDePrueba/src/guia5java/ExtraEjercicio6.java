package guia5java;

import java.util.Scanner;

public class ExtraEjercicio6 {

    public static void main(String[] args) {

        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
        caracteres y, a medida que el usuario las va ingresando, construya una
        “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las 
        palabras se ubicarán todas en orden horizontal en una fila que será 
        seleccionada de manera aleatoria. Una vez concluida la ubicación de 
        las palabras, rellene los espacios no utilizados con un número aleatorio
        del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java substring(), Length() y Math.random().*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        int cantp = 0;
        int fila= (int) (Math.random()*20);
        String[][] matriz = new String[fila][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                do {
                     System.out.println("Ingrese una palabra: ");
                     palabra = entrada.next();
                       cantp++;
                    if (palabra.length() >= 3 && palabra.length() <= 5) {
                        matriz[i][j] = palabra.substring(0,1);
                        System.out.println("cantidad de palabras: " + cantp);
                    } else {
                        System.out.println("La palabra debe tener mínimo entre 3 y 5 caracteres:");
                    }
                    /* a la verga, si existe y sino,vacío. SINO PRIMERO LLENAR Y DESPUÉS REEMPLAZAR
                    if (matriz[i][j].equals("")) {
                        matriz[i][j] = "x";
                    }*/
                } while (cantp < 5);
            }
        }
        System.out.println("" + cantp);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }
}
