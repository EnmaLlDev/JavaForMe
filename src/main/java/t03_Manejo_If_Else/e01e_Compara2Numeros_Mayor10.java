
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01e_Compara2Numeros_Mayor10 {
    // Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Introduce un numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce otro numero:");
        int userNumber2=scanner.nextInt();
        
        if(userNumber1>=10||userNumber2>=10) System.out.println("Uno de los numeros introducidos es mayor a 10");
        else System.out.println("Ninguno es mayor a 10!");
    }
}
