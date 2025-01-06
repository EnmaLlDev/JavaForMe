package t04_Bucles;
import java.util.Scanner;

public class e13_NumeroPositivo_DoWhile {
        /* Programa al que le introduzcas un número y que garantice que es positivo, es decir si lo 
        introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que sea necesario 
        hasta que se introduzca uno positivo. 
        
        Cuando tenemos que hacer algo una o más veces, pero por lo menos una, el do…while puede ser 
        mejor opción que el while. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorNumerico;
            do{
                System.out.println("Introduce el valor positivo!");
                valorNumerico=scanner.nextInt();
            }while((valorNumerico<=0));    
        System.out.println("ok, numero positvo!");    
    }
}

        
                
       
  

