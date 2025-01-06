
package t03_Manejo_If_Else;

import java.util.Scanner;

public class e01b_Leer_Mostrar_NumeroMayor {
    // Leer dos números enteros y muestre si el primero es mayor que el segundo. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Introduce el primer numero:");
        int userNumber1=scanner.nextInt();
         System.out.println("Introduce el segundo numero:");
        int userNumber2=scanner.nextInt();
        
        if(userNumber1>userNumber2) System.out.println("El primer numero es mayor"); 
        else System.out.println("El segundo numero es mayor");
    }
}
