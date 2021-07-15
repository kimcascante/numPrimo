package Semana7;
/**
 * Nombre del programa: 
 * Descripcion: Determinar si un número es primo o no. Un número es primo si es divisible entre sí
    mismo y la unidad
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej1w7 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
        int num=0;
        String primo=" ";

        escribir.println("Digite el numero a analizar: ");
        num = Integer.parseInt(leer.readLine());

        if (num<2){
            primo = "El numero es primo";
        } else{
            for(int count=2; count<=num; count++){
                if(num % count == 0){
                    primo = "El numero es primo";
                } 
                
                if (num%2==0) {
                    primo = "El numero es par";
                }
            }
        }

        escribir.println(primo);

    }
}