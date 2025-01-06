package t04_Bucles;
import java.util.Random;
import java.util.Scanner;

public class e16_AdivinaNumero_Bucle {
    /* Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99 que habrá
    que adivinar. El jugador intentará adivinar el número y el programa le responderá si es mayor, menor
    o si ha acertado. Se dispone de un máximo de 5 intentos */
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Numero aleatorio generado.");
        int numeroAleatorio=random.nextInt(1,99);
        
        int numeroUsuario; 
        int intentos=5;    
            System.out.println("Hola, intenta adivinar el numero generado al azar "
                + "tendras 5 intentos, comencemos!");
        while(intentos!=0){
            System.out.println("Introduce un numero!");
            numeroUsuario=scanner.nextInt();
            intentos--;    
            if(numeroAleatorio>numeroUsuario){
                System.out.println("El nuemro es mayor, te quedan: \n"+intentos+ " intentos.");
                }
            else if(numeroAleatorio<numeroUsuario){
                System.out.println("El nuemro es menor, te quedan: \n"+intentos+ " intentos.");
                }
            else if(numeroAleatorio==numeroUsuario){
                System.out.println("Has acertado en: "+intentos+ " intentos." );
                break;
            }
        }
    }
}

          
       
  
