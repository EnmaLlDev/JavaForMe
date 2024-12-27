
package ejercicios;
import java.util.Scanner;
public class ejercicios_8 {
    /* 8
    Muestra la tabla de multiplicar de un número introducido por teclado.
    */

    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Introduce un multiplo:"); 
       int multiplo=scanner.nextInt();
       
       final int LIMITE=10;
       for(int i=0;i<=LIMITE;i++){
            System.out.println(multiplo + " x " + i + " = " + (multiplo * i));
        }
    }
}
