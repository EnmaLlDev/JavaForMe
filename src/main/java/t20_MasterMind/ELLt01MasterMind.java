
package t20_MasterMind;

import java.util.Scanner;

public class ELLt01MasterMind {
        /* Mostrar un mensaje de bienvenida y decirle al usuario que introduzca un número, qué será el
        número que deberá adivinar el jugador. Suponemos que el número introducido está comprendido
        entre 100 y 999. A continuación, mostrar cada uno de los dígitos de ese número por separado, cada
        uno en una variable distinta: unidades, decenas, centenas.*/
        public static void main(String[] args) {
        
        int numeroUsuario=0;
        int centenas,decenas,unidades;
                
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido a MASTERMIND!");
        
        try{
            System.out.println("Introduce un numero a adivinar, comprendido entre 100 y 999");
            numeroUsuario = scanner.nextInt();
            }catch(Exception error){
            System.out.println(error.toString()); 
            }
            // Calculos para extraer centenas, decenas y unidades
            centenas = numeroUsuario / 100; 
            decenas = (numeroUsuario / 10) % 10; 
            unidades = numeroUsuario % 10;
            
            // Mostrar los resultados
            System.out.println("El numero ingresado es: " + numeroUsuario);
            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);
        
        scanner.close();
    }           
}
    /*Avances MasterMind
    public static void main(String[] args) {
    
        Random random = new Random();
  
        final int numeroJuego=random.nextInt(0,9999) ;
        int intentos=10;
        int numeroUsuario;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido a MASTERMIND!" +
                   "\n Tienes " + intentos + " intentos para adivinar el numero de 4 digitos.");
        
        while (intentos>0){
            System.out.println("Introduce un numero de 4 digitos:");
            numeroUsuario=scanner.nextInt(); 
        if (numeroUsuario==numeroJuego){
            System.out.println("Has acertado el numero:" + numeroJuego+ " en " + intentos + " intentos.");
            break;
        }else{
            intentos--;
            if(intentos>0) System.out.println("Intentos restantes:"+intentos+"\n---------Prueba denuevo!---------");
            else System.out.println("Te has quedado sin intentos. El numero era: " + numeroJuego);
            }
        }   
    }
}*/
