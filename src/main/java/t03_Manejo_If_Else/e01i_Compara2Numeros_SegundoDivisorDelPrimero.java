
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01i_Compara2Numeros_SegundoDivisorDelPrimero {
    /* Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones 
    por cero, que causan error) Repasar operadores en cortocircuito para hacer un solo if */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
      
        System.out.println("Introduce el primer numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce el segundo numero:");
        int userNumber2=scanner.nextInt();

        try {
            if(userNumber2!=0 && userNumber1%userNumber2==0) System.out.println("Correcto, el segundo numero es divisor del primero");
            else System.out.println("Error: No es divisor del primero!");  
            }     
        catch(ArithmeticException e){
            System.out.println("Error: imposible dividir entre cero"); 
        }
    }
}
