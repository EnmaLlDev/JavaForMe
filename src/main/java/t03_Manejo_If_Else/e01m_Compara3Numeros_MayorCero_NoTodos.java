
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01m_Compara3Numeros_MayorCero_NoTodos {
    /* Leer tres números enteros y diga hay alguno mayor que cero, pero no todos. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce el primer numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce el segundo numero:");
        int userNumber2=scanner.nextInt();
        System.out.println("Introduce el tercero numero:");
        int userNumber3=scanner.nextInt(); 
        
        int contador=0;
        
        if(userNumber1>0){contador++;}
        if(userNumber2>0){contador++;}
        if(userNumber3>0){contador++;}
           
        if(contador>0 && contador<3){
            System.out.println("Al menos uno o dos numeros son mayores a cero, pero no todos");
        } else {System.out.println("Todos los numeros son postivos o negativos!!!");}
    }               
  }  
