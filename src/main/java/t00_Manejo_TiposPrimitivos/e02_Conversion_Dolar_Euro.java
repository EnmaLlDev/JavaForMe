
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;
public class e02_Conversion_Dolar_Euro {
        //Programa que lea por consola un valor en dólares y lo convierta a euros
        public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);   

        final double EuroValue=1.14;
        System.out.println("Enter any value in Dollars" );
        double userValue = scanner.nextDouble(); 
        double result = userValue*EuroValue;

        System.out.println("The result is: " + result + " Euros." );
    }
}
