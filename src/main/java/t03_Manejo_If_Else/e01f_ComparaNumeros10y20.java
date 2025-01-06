
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01f_ComparaNumeros10y20 {
    //  Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Introduce un numero:");
        int userNumber=scanner.nextInt();
        
        if(userNumber> 0) {
            if(userNumber>=10 && userNumber<=20) System.out.println("Numero VALIDO");
            else System.out.println("Numero fuera de rango!");
        }
        else System.out.println("Numero INVALIDO!");  
    }
}
