package t04_Bucles;
import java.util.Scanner;
public class e08_CalcularSumatoria100 {
    /*Calcular la suma de los 100 números siguientes a uno tecleado previamente.*/

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Introduce un número:");
        int numeroUsuario = teclado.nextInt();
        int sumatoria=0;
        
        if(numeroUsuario>0){
            
            for(int i = numeroUsuario + 1; i <= numeroUsuario + 100; i++){
                sumatoria += i;
            }
        }
        System.out.println("La sumatoria de los 100 numeros siguientes de:"+numeroUsuario
                           +"\nes:"+sumatoria);
    } 
}
        
        
