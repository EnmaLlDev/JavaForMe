
package t01_Ejercicios_Numericos;
import java.util.Scanner;
public class e07_Adivina_Combinacion {
    /* 7
    Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
    El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
    mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
    ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte. */

    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Introduce la combinacion de la caja fuerte"); 
       int numero_caja=scanner.nextInt();

       int intentos=4;
       int user=0;
       
        while(intentos!=0){
            System.out.println("Introduce una combinacion de 4 digitos");
            user=scanner.nextInt();
            intentos--;
            if(user==numero_caja){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente" 
                        + " te quedaron:"+intentos);
            }
            else {System.out.println("Lo siento, esa no es la combinación\nIntentos restantes:"+intentos);
            }   
        } 
    }
}
