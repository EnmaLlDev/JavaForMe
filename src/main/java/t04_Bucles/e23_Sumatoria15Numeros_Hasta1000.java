package t04_Bucles;

import java.util.Scanner;

public class e23_Sumatoria15Numeros_Hasta1000 {
    /* Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta que
    introduzca un número mayor que 1000. 
    Si no se introduce un número mayor que 1000 el programa finalizará después de introducidos 15 números. 
    (Ojo: es fácil equivocarse y hacer que solicite un numero de más o bien que no sume correctamente) */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 
        int numero, resultado=0, intentos=0;

        while(intentos!=15){
            {System.out.println("Ingresa un numero:");}
            numero = scanner.nextInt();
            resultado+=numero;
            intentos++;
            if(resultado>1000){
                System.out.println("fuera!");
                break;
            }
                  
            System.out.println("Sumatoria"+resultado+"\nIntentos:"+intentos);
        }
        {System.out.println("Se acabaron los intentos!");}
    }
}

        
                
       
  

