package guia5java;

import java.util.Scanner;

public class ejercicio3guia {

    public static void main(String[] args) {

        /*Recorrer un vector de N enteros contabilizando cuántos números son 
        de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int[] vector = new int[12];
        for (int i = 0; i < 12; i++) {
            vector[i] = (int) (Math.random() * 1000);
           System.out.println("vector ["+vector[i]+"]");
            String vlong = String.valueOf(vector[i]);
            if (vlong.length()==1) {
                c1++;
            }
            if (vlong.length()==2) {
                c2++;
            }
            if (vlong.length()==3) {
                c3++;
            }
            if (vlong.length()==4) {
                c4++;
            }
            if (vlong.length()==5) {
                c5++;
            }            
        }
                System.out.println("la cantidad de nros con 1 digito es: "+c1);
                System.out.println("la cantidad de nros con 2 digitos es: "+c2);
                System.out.println("la cantidad de nros con 3 digitos es: "+c3);
                System.out.println("la cantidad de nros con 4 digitos es: "+c4);
                System.out.println("la cantidad de nros con 5 digitos es: "+c5);
    }
}
