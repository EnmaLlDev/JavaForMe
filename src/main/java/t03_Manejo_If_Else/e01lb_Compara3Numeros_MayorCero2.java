
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01lb_Compara3Numeros_MayorCero2 {
    /* Leer tres números enteros y diga hay alguno mayor que cero.
        con centinela booleano*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce el primer numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce el segundo numero:");
        int userNumber2=scanner.nextInt();
        System.out.println("Introduce el tercero numero:");
        int userNumber3=scanner.nextInt(); 
        
        boolean mayorCero=false; // uso de centinela 
        
        if(userNumber1>0 || userNumber2>0 || userNumber3>0){
            mayorCero=true;
            
            if(mayorCero)
            {System.out.println(userNumber1 + " alguno de los tres numeros es mayor a cero.");}  
        } else {System.out.println("Ninguno de los numeros es mayor a cero.");}
    }               
  }  
