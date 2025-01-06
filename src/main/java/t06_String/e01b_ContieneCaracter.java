package t06_String;

import java.util.Scanner;

public class e01b_ContieneCaracter {
        /* b. Decir si en la cadena aparece el carácter ‘x’. */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        /*b*/
        String cadena02;
        String caracter = "x";
        boolean condicion = false;
        do{
            System.out.println("b)Introduce un String de prueba");
            cadena02 = scanner.next();
            if(cadena02.contains("x".toLowerCase())){
                System.out.println("si ("+caracter+") esta presente en ("+cadena02+")");
                condicion=true;
            } else System.out.println("no!");
        }while(condicion==false);
        System.out.println("----------------------------------------");
        
        /*Solucion simple*/
        System.out.println("Solucion Simple");
        if(cadena02.contains(caracter)){System.out.println("Corecto!");
        }else System.out.println("Incorrecto");
        System.out.println("Fin del programa~!");
    }
}
