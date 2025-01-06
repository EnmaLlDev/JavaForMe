
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01d_Compara2Numeros_PrimeroMayorSegundo {
    // Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Introduce un numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce otro numero:");
        int userNumber2=scanner.nextInt();
        if(userNumber1>0 && userNumber2>0){
            if(userNumber1 >= 10 && userNumber2 >= 10) {
            System.err.println("Son mayores a 10");        
            }
            else System.out.println("Son menores a 10");
        }else System.out.println("Numeros positivos, porfavor");
    }
}
