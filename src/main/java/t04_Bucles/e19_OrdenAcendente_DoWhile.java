package t04_Bucles;
import java.util.Scanner;
public class e19_OrdenAcendente_DoWhile {
        /* Programa que se le introduzcan números por consola y que informe si 
        están ordenados ascendentemente o no. El programa finaliza si se introduce
        cero o en cuanto se detecte que los números no están ordenados.
        
    Para cada número, puedo ver si es mayor que el anterior. En ese caso estarán 
        ordenados ascendentemente, en caso contrario no.  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muestra los numeros introducidos de forma ascendente:");
        int numero_usuario, valor_inicial;
        int mayor=0; 
        System.out.println("Introduce un valor incial:");
        valor_inicial= scanner.nextInt();
        System.out.println("Introduce los numeros siguientes:");
        numero_usuario = scanner.nextInt();        

            if(valor_inicial<numero_usuario){
                System.out.println("El valor incial fue sustituido, ahora es el mayor");
                mayor=numero_usuario;
                do{
                System.out.println("Introduce los numeros siguientes:");  
                numero_usuario = scanner.nextInt();
                if(mayor<numero_usuario) {
                    mayor=numero_usuario;
                    System.out.println("Puedo ver si que si es mayor que el anterior.");
                } else{
                    System.out.println("Error 1: Alteraste el orden ascendente, sales del bucle");
                    break;
                }    
                }while (numero_usuario!=0);
            } else{ System.out.println("Error 2: Introjuste un 0.");}
        
        
        
        System.out.println("Fin del bucle." ); 
    }
}
       
       
  

