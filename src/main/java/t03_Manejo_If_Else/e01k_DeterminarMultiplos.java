
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01k_DeterminarMultiplos {
    /* Leer un número y decir si es múltiplo de 2, de 3 y/o de 10. Si no es múltiplo de 2 ya no 
hay que mirar si lo es de 10.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce un numero:");
        int userNumber=scanner.nextInt();
        System.out.println("Vamos a determinar los multiplos del numero:" + userNumber);
            if(userNumber %2==0){
                System.out.println(userNumber+" es multiplo de 2.");
                if(userNumber %10==0){
                     System.out.println(userNumber+" tambien es multiplo de 10.");
                }
            } else{ System.out.println(userNumber+" no es múltiplo de 2.");}           
            
            if(userNumber %3==0){
                    System.out.println(userNumber+" tambien es multiplo de 3.");
            } else{ System.out.println(userNumber+" no es múltiplo de 3.");}           
    }               
  }  
