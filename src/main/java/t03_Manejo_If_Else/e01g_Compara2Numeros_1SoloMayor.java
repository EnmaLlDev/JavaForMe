
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01g_Compara2Numeros_1SoloMayor {
    //  Leer dos números enteros y diga si uno y solo uno es mayor de 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Introduce un numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce otro numero:");
        int userNumber2=scanner.nextInt();
        
        if((userNumber1>10 && userNumber2<=10)||(userNumber1<=10 && userNumber2>10)) {
             System.out.println("Solamente uno de los números es mayor a 10.");  
        }else 
             System.out.println("Ambos numeros son mayores de 10 o ambos son menores o iguales a 10.");  
    }
}
