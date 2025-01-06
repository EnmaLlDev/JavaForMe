
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01c_Compara2Numeros_Mayor {
    // Leer un número entero y de determinar si se trata de un número par o impar.  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Introduce un numero:");
        int userNumber=scanner.nextInt();
        int parNumber;
        
        if(userNumber>0) {
            parNumber = userNumber%2;
            if(parNumber==0)System.out.println("Numero par!"); 
            else System.out.println("El numero es impar!.");
        }
        else System.out.println("El numero invalido!");
    }
}
