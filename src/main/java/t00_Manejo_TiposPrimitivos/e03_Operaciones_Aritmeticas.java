
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;
public class e03_Operaciones_Aritmeticas {
        /*programa que lea por consola dos números enteros (sin decimales) y nos muestre 
        los resultados de sumar, restar y dividir dichos números. Comprueba que la división 
        responde con decimales*/
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------- VALUES ------------------");
        System.out.print("Enter the firts value:");
        int firtsValue = teclado.nextInt();
        System.out.print("Enter the secound value:");
        int secondValue = teclado.nextInt();
        //OPERATIONS
        int addition = firtsValue+secondValue;
        int subtraction =firtsValue-secondValue; 
        double division = ((double)firtsValue/secondValue);  //parseo (double) 
        int multiplication = firtsValue*secondValue;
        
       System.out.println("----------------- RESULTS ------------------");
       System.out.println("the addition result is: " + addition );
       System.out.println("the subtraction result is: " + subtraction );
       System.out.println("the division result is: " + division ); //printf --> formato(%.2f or %.3f)
       System.out.println("the multiplication result is: " + multiplication );
    }
}
