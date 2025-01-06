package t04_Bucles;
import java.util.Scanner;

public class e09_Suma100_Condicion {
        /*Sumar una cantidad de números que se van introduciendo por teclado hasta 
        que la suma de los mismos valga más de 100. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int limite=0; 
        
        while (limite!=101){
            System.out.println("Introduce un numero distinto de 100:");
            userNumber=scanner.nextInt();
            
            if (userNumber>0){
                limite+=userNumber;
                System.out.println("Cantidad acumulada:"+limite);  
            }else{System.out.println("Introduce numeros validos.");} 
        }
        System.out.println("fin del bucle"); 
    }      
} 

//Puede mejorarse

        
                
       
  

