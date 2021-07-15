package Semana10;

/**
 * Nombre del programa: 
 * Descripcion: Haga una función que retorne “true” si un número entero dado es primo, o “false” si no.
    Pruébela en un main. Utilice esta función para imprimir los números primos desde 1-100, en un
    programa en Java.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej4w10 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException {

        calcularPrimo();

    }

    public static String calcularPrimo() throws IOException {
        int num;
        String primo = "";
        String primos="1";

        escribir.println("Digite el numero a analizar: ");
        num = Integer.parseInt(leer.readLine());

        if (num < 2) {
            primo = "TRUE";
        } else {
            for (int count = 2; count <= num; count++) {
                if (num % count == 0) {
                    primo = "TRUE";
                }

                if (num % 2 == 0) {
                    primo = "FALSE";
                }
            }
        }

        /*for (int countk = 1; countk <= 100; countk++) {
                for (int countj = 2; countj <= countk; countj++) {
                    if ((countk%countj == 0) && (countk%2 != 0)) {
                        primos = primos + " - " + countk;
                    }
                }
        }*/

        for (int countk = 1; countk <= 100; countk++) {
            if(countk%2 != 0){
                primos = primos + " - " + countk;
            }
        }
        
        escribir.println(primo);
        escribir.println("Numeros primos del 1 al 100");
        escribir.println(primos);

        return primo;
    }
}
