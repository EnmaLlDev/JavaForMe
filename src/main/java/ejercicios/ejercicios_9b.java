package ejercicios;
import java.util.Scanner;
public class ejercicios_9b {
    /* 9
     Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
     Hay que realizar el ejercicio utilizando bucles. La única limitación en el número de dígitos
     la establece el tipo de dato que se utilice (int o long).
    */
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int contador_digitos=0;
        int numero_filtro=Math.abs(numero); //captura los valores nuemricos negativos
        
        if(numero_filtro==0){
            contador_digitos=1;
        }else{
            while(numero_filtro>0){
                contador_digitos++;
                numero_filtro/=10; //devuelve la cantidad de digitos 
            }
        
        } System.out.println("La cantidad de digitos del numero:"+numero+" son: "+contador_digitos);
        
    }
}
