
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01h_Compara2Numeros_VariasOpciones {
    // Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos números son iguales. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Introduce un numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce otro numero:");
        int userNumber2=scanner.nextInt();
        
        if(userNumber1>0 &&userNumber1>0){
            if(userNumber1>userNumber2) System.out.println("El primer numero es mayor al segundo"); 
            else if (userNumber1<userNumber2) System.out.println("El segundo numero es mayor primero"); 
            else if (userNumber1==userNumber2) System.out.println("El primer y segundo numero son iguales!"); 
        }else System.out.println("Alguno de los numeros es invalidos!");  
    }
}
