package t06_String;

import java.util.Scanner;

public class e01e_Obtener_5Posiciones {
        /*  e. Crear una cadena formada por las 5 primeras posiciones de la cadena. */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       /*e*/
        System.out.println("e)Introduce un String de prueba");
        String cadena05 = scanner.next();
        /*el índice inicial de una cadena es “0” y 
        la posición del índice final no se incluye:*/
        String sub_String = cadena05.substring(0, 5); 

        if (cadena05.length()>=4){
            System.out.println("Nueva cadena: "+sub_String);
        }else{System.out.println("Incorrecto!");}
        
        System.out.println("----------------------------------------");
        System.out.println("Fin del programa!");
    }
}
