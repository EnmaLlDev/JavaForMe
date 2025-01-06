package t06_String;

import java.util.Scanner;

public class e01a_Mayuscula_Minisculas {
        /* 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:
        a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
        */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        /*a*/ 
        //Uso general  y modifica la entrada de datos
        System.out.println("a)Introduce un String de prueba");
        String cadena01 = scanner.next().toUpperCase();
        System.out.println("Mayuculas: "+cadena01);
        
        //modifica el resultado
        System.out.println("Minusculas: "+cadena01.toLowerCase());
        System.out.println("----------------------------------------");
        System.out.println("Fin del programa~!");
    }
}
