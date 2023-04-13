package guia3java;

import java.util.Scanner;

public class ejerciciosExtras {

    public static void main(String[] args) {

        /*Dado un tiempo en minutos, calcular su equivalente en días y horas.
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular
    su equivalente: 1 día, 2 horas.*/
        Scanner entrada = new Scanner(System.in);

        int hora, min, rmin, dia, mhora;

        System.out.println("Ingrese la cantidad de minutos");
        min = entrada.nextInt();

        hora = (min / 60);
        rmin = min % 60;
        dia = hora / 24;
        mhora = hora % 24;

        System.out.println("Su equivalente en dias es: " + dia + " en horas: " + mhora + " minutos: " + rmin);

        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
    diferente a cada una. A continuación, realizar las instrucciones necesarias 
    para que: B tome el valor de C, C tome el valor de A, A tome el valor de D
    y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
    de cada variable. Utilizar sólo una variable auxiliar.*/
        Scanner entrada2 = new Scanner(System.in);
        int a, b, c, d, aux;
        a = 2;
        b = 4;
        c = 6;
        d = 8;

        aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;

        System.out.println("los valores son; a; " + a + ",b: " + b + ",c: " + c + ",d: " + d);

        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si
    se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
    la función equals() de la clase String.*/
        Scanner entrada3 = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = entrada3.next();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("La letra es una consonante.");
        }

        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
      y se muestre su equivalente en romano.*/
        Scanner entrada4 = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese un nro entre 1 y 10");
        nro = entrada4.nextInt();

        switch (nro) {
            case 1:
                System.out.println("su equivalente en nro romano es: -i- ");
                break;
            case 2:
                System.out.println("su equivalente en nro romano es: -ii- ");
                break;
            case 3:
                System.out.println("su equivalente en nro romano es: -iii- ");
                break;
            case 4:
                System.out.println("su equivalente en nro romano es: -iv- ");
                break;
            case 5:
                System.out.println("su equivalente en nro romano es: -v- ");
                break;
            case 6:
                System.out.println("su equivalente en nro romano es: -vi- ");
                break;
            case 7:
                System.out.println("su equivalente en nro romano es: -vii- ");
                break;
            case 8:
                System.out.println("su equivalente en nro romano es: -viii- ");
                break;
            case 9:
                System.out.println("su equivalente en nro romano es: -ix- ");
                break;
            case 10:
                System.out.println("su equivalente en nro romano es: -x- ");
                break;
            default:
                System.out.println("El nro no es válido");
        }

        /*Una obra social tiene tres clases de socios:
    Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
    en todos los tipos de tratamientos.Los socios tipo ‘B’ abonan una cuota 
    moderada y tienen un 35% de descuento para los mismos tratamientos que 
    los socios del tipo A.Los socios que menos aportan, los de tipo ‘C’, no 
    reciben descuentos sobre dichos tratamientos.Solicite una letra (carácter)
    que representa la clase de un socio, y luego un valor real que represente 
    el costo del tratamiento (previo al descuento) y determine el importe en
    efectivo a pagar por dicho socio.*/
        Scanner entrada5 = new Scanner(System.in);
        String socio;
        int costo;
        double cfinal;
        //cfinal=0;
        System.out.println("Ingrese A, B o C para indicar su clase de socio: ");
        socio = entrada5.next();
        System.out.println("Ingrese el valor del tratamiento:");
        costo = entrada5.nextInt();

        if (socio.equalsIgnoreCase("a")) {
            cfinal = costo - (costo * 0.5);
            System.out.println("Con el descuento aplicado el importe final es: " + cfinal);
        }
        if (socio.equalsIgnoreCase("b")) {
            cfinal = costo - (costo * 0.35);
            System.out.println("Con el descuento aplicado el importe final es: " + cfinal);
        }
        if (socio.equalsIgnoreCase("c")) {
            System.out.println("Su categoria de socio no tiene ningún descuento.");
        }

        /*Leer la altura de N personas y determinar el promedio de estaturas que
    se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/
        Scanner entrada6 = new Scanner(System.in);
        double estatura, prom1, prom2, contt, contp;
        int n;
        System.out.println("Indique la cantidad de personas");
        n = entrada6.nextInt();
        contp = 0;
        contt = 0;
        prom1 = 0;
        prom2 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su estatura");
            estatura = entrada6.nextDouble();
            contt = contt + estatura;
            if (estatura < 1.60) {
                contp = contp + estatura;
            }
        }
        prom1 = prom1 + contp / n;
        prom2 = prom2 + contt / n;
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts es: " + prom1);
        System.out.println("El promedio de estaturas general es: " + prom2);

        /*Realice un programa que calcule y visualice el valor máximo, el valor
    mínimo y el promedio de n números (n>0). El valor de n se solicitará al
    principio del programa y los números serán introducidos por el usuario.
    Realice dos versiones del programa, una usando el bucle “while” y otra 
    con el bucle “do - while”.*/
        //v- while.
        Scanner entrada7 = new Scanner(System.in);
        int cont, num, nmax, nmin, i, suma;
        nmin = 0;
        nmax = 0;
        suma = 0;
        double promedio;
        System.out.println("Cuántos nros desea ingresar ?");
        i = entrada7.nextInt();
        cont = 0;
        while (cont < i) {
            System.out.println("Ingrese nros");
            num = entrada7.nextInt();
            suma = suma + num;
            if (num > nmax) {
                nmax = num;
            }
            if (cont == 0) {
                nmin = num;
            }
            cont++;
        }
        promedio = suma / i;
        System.out.println("El nro mínimo ingresado es; " + nmin + ", el nro máximo es: " + nmax + ", y el promedio es: " + promedio);

        //v- do-while
        Scanner entrada8 = new Scanner(System.in);
        int cont2, num2, nmax2, nmin2, i2, suma2;
        nmin2 = 0;
        nmax2 = 0;
        suma2 = 0;
        double promedio2;
        System.out.println("Cuántos nros desea ingresar ?");
        i2 = entrada8.nextInt();
        cont2 = 0;

        do {
            System.out.println("Ingrese nros");
            num2 = entrada8.nextInt();
            suma2 = suma2 + num2;
            if (num2 > nmax2) {
                nmax2 = num2;
            }
            if (cont2 == 0) {
                nmin2 = num2;
            }
            cont2++;

        } while (cont2 < i2);

        promedio2 = suma2 / i2;
        System.out.println("El nro mínimo ingresado es; " + nmin2 + ", el nro máximo es: " + nmax2 + ", y el promedio es: " + promedio2);

        /*Escriba un programa que lea números enteros. Si el número es múltiplo de
    cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
    cantidad de números pares y la cantidad de números impares. Al igual que
    en el ejercicio anterior los números negativos no deben sumarse. Nota: 
    recordar el uso de la sentencia break.*/
        Scanner entrada9 = new Scanner(System.in);
        int numero, contador, cpar, cimpar;
        contador = 0;
        cpar = 0;
        cimpar = 0;
        do {
            System.out.println("Ingrese nros");
            numero = entrada9.nextInt();
            if (numero > 0) {
                contador++;
            }
            if (numero % 2 == 0) {
                cpar++;
            }
            if (numero % 2 != 0) {
                cimpar++;
            }
        } while (numero % 5 != 0);
        System.out.println("La cantidad de nros ingresados es: " + contador);
        System.out.println("La cantidad de nros pares ingresados es: " + cpar);
        System.out.println("La cantidad de nros impares ingresados es: " + cimpar);

        /*Simular la división usando solamente restas. Dados dos números enteros 
    mayores que uno, realizar un algoritmo que calcule el cociente y el 
    residuo usando sólo restas. Método: Restar el dividendo del divisor 
    hasta obtener un resultado menor que el divisor, este resultado es el
    residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
        Scanner entrada10 = new Scanner(System.in);
        int nn1, nn2, contresta, res;
        contresta = 0;
        System.out.println("Ingrese el 1er nro");
        nn1 = entrada10.nextInt();
        System.out.println("Ingrese el 2do nro");
        nn2 = entrada10.nextInt();
        res = 0;
        if (nn1 > 1 && nn2 > 1) {
            while (nn1 > nn2) {
                nn1 = nn1 - nn2;
                contresta++;
            }
        }
        System.out.println("El cociente es : " + contresta);
        System.out.println("El resto es : " + nn1);

        /*Realice un programa para que el usuario adivine el resultado de una 
    multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
    El programa debe indicar al usuario si su respuesta es o no correcta.
    En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
    su respuesta nuevamente. Para realizar este ejercicio investigue como 
    utilizar la función Math.random() de Java.*/
        Scanner entrada11 = new Scanner(System.in);
        int ranres, multi;
        multi = 0;
        int ran1 = (int) (Math.random() * 10);
        int ran2 = (int) (Math.random() * 10);

        do {
            System.out.println("Adivine el resultado de la multiplicación" + ran1 + ran2);
            ranres = entrada11.nextInt();
            multi = ran1 * ran2;
        } while (ranres != multi);
        if (ranres == multi) {
            System.out.println("Su respuesta es correcta!");
        }

        /*Escribir un programa que lea un número entero y devuelva el número de 
    dígitos que componen ese número. Por ejemplo, si introducimos el
    número 12345, el programa deberá devolver 5. Calcular la cantidad de 
    dígitos matemáticamente utilizando el operador de división. Nota: 
    recordar que las variables de tipo entero truncan los números o resultados.*/
        Scanner entrada12 = new Scanner(System.in);
        int ing, div, cdiv;
        System.out.println("Ingrese un nro para calcular las cifras que contiene.");
        ing = entrada12.nextInt();
        cdiv = 0;
        div = 10;

        while (ing > 0) {
            ing = ing / div;
            cdiv++;
        }
        System.out.println("La cantidad de digito s del nro ingresado es: " + cdiv);

        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
    números del 0-0-0 al 9-9-9, con la particularidad que cada vez que 
    aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
        Scanner entrada13 = new Scanner(System.in);
        String tres, auxi, jLetra, kLetra, iLetra;

        for (int ii = 0; ii < 10; ii++) {
            for (int jj = 0; jj < 10; jj++) {
                for (int kk = 0; kk < 10; kk++) {
                    if (ii == 3) {
                        iLetra = "E";
                    } else {
                        iLetra = Integer.toString(ii);
                    }

                    if (jj == 3) {
                        jLetra = "E";
                    } else {
                        jLetra = Integer.toString(jj);
                    }

                    if (kk == 3) {
                        kLetra = "E";
                    } else {
                        kLetra = Integer.toString(kk);
                    }

                    System.out.println(iLetra + "" + jLetra + "" + kLetra);

                }
            }
        }

        /*Crear un programa que dibuje una escalera de números, donde cada 
    línea de números comience en uno y termine en el número de la línea.
    Solicitar la altura de la escalera al usuario al comenzar. Ejemplo:
    si se ingresa el número 3:
    1
    12
    123*/
        Scanner entrada14 = new Scanner(System.in);
        int altura;
        System.out.println("Ingrese altura de la escalera;");
        altura = entrada14.nextInt();
        System.out.println("Resultado:");

        for (int iii = 0; iii <= altura; iii++) {
            for (int jjj = 0; jjj < iii; jjj++) {
                System.out.print(jjj + 1);
            }
            System.out.println(" ");
        }

        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene 
    una M cantidad de hijos. Escriba un programa que pida la cantidad de
    familias y para cada familia la cantidad de hijos para averiguar la 
    media de edad de los hijos de todas las familias.*/
        Scanner entrada15 = new Scanner(System.in);
        int nfam, nhijos, edades;
        double promedio1, contedad, sumaedad;
        System.out.println("Ingrese el nro de familias: ");
        nfam = entrada3.nextInt();
        contedad = 0;
        sumaedad = 0;

        for (int ia = 1; ia <= nfam; ia++) {
            System.out.println("Familia nro : " + ia);
            System.out.println("Ingrese nro de hijos: ");
            nhijos = entrada3.nextInt();
            for (int ja = 0; ja < nhijos; ja++) {
                System.out.println("Ingrese la edad de los hijos: ");
                edades = entrada3.nextInt();
                sumaedad = sumaedad + edades;
                contedad++;
            }
        }
        System.out.println("suma de edades: " + sumaedad);
        System.out.println("cont d hijos:" + contedad);
        promedio1 = sumaedad / contedad;
        System.out.println("La edad media de los hijos de todas la familias es:" + promedio1);

    }
}
