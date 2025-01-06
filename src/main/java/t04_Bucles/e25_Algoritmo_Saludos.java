package t04_Bucles;

import java.util.Scanner;

public class e25_Algoritmo_Saludos {
    /* Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, siendo x un
    número entero positivo tecleado previamente (ojo: el número x puede ser par o impar) */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero positivo:");
        int x = scanner.nextInt();
        
        if(x<=0){
            System.out.println("El numero debe ser un entero positivo.");
        }else {
            for(int i=1; i<=x; i++){
                if(i%2==0){
                System.out.println("Adios!");
                }else{System.out.println("Hola!");}  
            }
        }
    }
}

        
                
       
  

