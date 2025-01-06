
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;
public class e01_Conversion_Euro_Dolar {
        //Programa que lea por consola un valor en euros y lo convierta a dólares 
        public static void main(String[] args) {
       
        Scanner scanner = new Scanner (System.in);   
        
        final double EuroValue=1.14;
        System.out.println("Enter any value in Euro" );
        double userValue = scanner.nextDouble(); 
        double result = userValue/EuroValue;
      
        System.out.println("The result is: " + result + " dollars." );
    }
}

