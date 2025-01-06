package t04_Bucles;
import java.util.Scanner;
public class e05_BucleSuma_DoWhile {
    /*Sumar una cantidad de números que se van introduciendo, siempre que sean 
    positivos hasta que se teclee el -1.
    Para sumar valores e ir acumulando esa suma se suele emplear una estructura
    con la siguiente forma. Antes del bucle: acumulador = 0. Y dentro del bucle
    acumulador = acumulador + nuevo valor.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario = 0;
        int acumulador=0;
        do{
            System.out.println("Introduce un numero:");
            numeroUsuario = scanner.nextInt();
            if(numeroUsuario==-1) System.out.println("Sales del bucle");
            else{acumulador = acumulador + numeroUsuario;} 
       
        }while(numeroUsuario>0);
        
        System.out.println("Fin del buble, has tecleado -1. \nSuma acumulada:"+acumulador);
    }
}
