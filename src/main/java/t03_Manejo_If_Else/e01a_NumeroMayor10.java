
package t03_Manejo_If_Else;

import java.util.Scanner;

public class e01a_NumeroMayor10 {
    // Leer un número entero y determinar si es mayor de 10. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        
        System.out.println("Introduce un numero entero mayor a 10:");
        int userNumber=scanner.nextInt();
        if(userNumber>10) System.out.println("El numero es mayor a 10."); 
        else System.out.println("Numero invalido!");
    }
}
