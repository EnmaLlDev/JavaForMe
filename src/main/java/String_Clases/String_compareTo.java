
package String_Clases;
import java.util.Scanner;
public class String_compareTo {
    /*4.12. Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean
    dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta
    que lo haga correctamente.*/
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
            String cadena0 = "000";
            String cadena = "000";
            
            int desbloqueo = cadena0.compareTo(cadena);
            System.out.println("Resultado: " + desbloqueo + " son iguales."); 
            
            String cadena1 = "2000";
            String cadena2 = "1000";
            
            int cerradoMayor = cadena1.compareTo(cadena2);
            System.out.println("Resultado: " + cerradoMayor + " cadena inicial es mayor."); 
            
            String cadena3 = "1000";
            String cadena4 = "2000";
            
            int cerradoMenor = cadena3.compareTo(cadena4);
            System.out.println("Resultado: " + cerradoMenor + " cadena inicial es menor."); 

    }
}