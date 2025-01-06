
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01la_Compara3Numeros_MayorCero {
    /* Leer tres números enteros y diga hay alguno mayor que cero.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce el primer numero:");
        int userNumber1=scanner.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        int userNumber2=scanner.nextInt();
            
        System.out.println("Introduce el tercero numero:");
        int userNumber3=scanner.nextInt(); 
        
        if(userNumber1>0 || userNumber2>0 || userNumber3>0){
            if(userNumber1>0){System.out.println(userNumber1 + " el primer numero es mayor a 0.");}
            if(userNumber2>0){System.out.println(userNumber2 + " el segundo numero es mayor a 0.");}
            if(userNumber3>0){System.out.println(userNumber3 + " el tercero numero es mayor a 0.");}
        }          
    }               
  }  
