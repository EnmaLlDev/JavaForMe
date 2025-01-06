
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;
public class e09_CambioValores_UsoVariable {
        /*Programa para sustituir el valor de una variable por otra
        Usando variable auxiliar*/
        public static void main(String[] args) {
            
        /*Primer error: Instanciar la clase Scanner con un objeto para leer 
        la entrada de datos*/
        Scanner teclado= new Scanner(System.in);
            
        //declaracion de variables iniciales y de uso temporal
        int var1, var2, varTemporal;
        
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        
        teclado.close();
        
        //Segundo error:asignacion erronea, lo correcto seria intercambiar de valores usando una variable temporal
        varTemporal = var1;
        var1 = var2;
        var2 = varTemporal;
        
        System.out.println("Ahora var1 es igual a var2" + var1);
        System.out.println("Ahora var2 es igual a var1" + var2);
        
    }
}
