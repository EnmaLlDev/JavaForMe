package t06_String;

import java.util.Scanner;

public class e01d_SepararCaractar_String {
        /* d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición. */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       /*d*/
        System.out.println("d)Introduce un String de prueba");
        String cadena04 = scanner.next();
        String caracter = "x";
        String sub_String = cadena04.substring(3, cadena04.length()); 
        /*Una forma simple*/
        //posicion 3 es relativa a la 4 por el conteo en base a 0.
        if (cadena04.indexOf('x', 3) != -1) {
            System.out.println("Solucion");
        }
        /*Otra forma*/
        if (sub_String.contains("x")){
            System.out.println(sub_String);
            System.out.println("Cadena contiene (x) a partir de la posicion 4");
        }else{System.out.println("Incorrecto!");}
        System.out.println("----------------------------------------");
        System.out.println("Fin del programa!");
 
    }
}
