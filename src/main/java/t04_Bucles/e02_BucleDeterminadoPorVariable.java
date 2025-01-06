package t04_Bucles;

import java.util.Scanner;

public class e02_BucleDeterminadoPorVariable {
    /* Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado 
    previamente */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int userNumber=scanner.nextInt();
        for(int i=0;i<=userNumber;i++){
            System.out.println("Nro:"+i);  
        }
        
        System.out.println("fin del bucle.");
    }
}
