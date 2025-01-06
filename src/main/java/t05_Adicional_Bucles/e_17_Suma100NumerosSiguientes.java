package t05_Adicional_Bucles;
import java.util.Scanner;
public class e_17_Suma100NumerosSiguientes {
    /* 17
    Realiza un programa que sume los 100 números siguientes a un número entero y positivo 
    introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
    un número positivo).
    */
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
        int numero; 
        int suma=0;
        
        while(true){
            System.out.println("Introduce número entero y positivo:");
            numero=scanner.nextInt();
            
            if(numero>0){
                break;
            }else{
               System.out.println("Numero incorrecto");
            }
        }

        for(int i=numero+1; i<=numero+100; i++){
            suma+=i;
        }
        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);
    }
}
