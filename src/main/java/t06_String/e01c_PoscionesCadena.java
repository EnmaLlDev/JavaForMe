package t06_String;

import java.util.Scanner;

public class e01c_PoscionesCadena {
        /* c. Decir si la cadena tiene más de 10 posiciones. */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       /*c*/
        System.out.println("c)Introduce un String de prueba");
        String cadena03 = scanner.next();
        if (cadena03.length()>=10) {
            System.out.println("Cadena tiene 10 o mas posiciones.");
        }else{System.out.println("Longitud incorrecta!");}
        System.out.println("----------------------------------------");
        System.out.println("Fin del programa~!");
    }
}
