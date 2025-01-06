
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e15_ExaminarCodigo_3VersionesComentarios {
    /*  Haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado 2 números 
        int sobre sendas variables llamadas ‘a’ y ‘b’ y que incluyan las instrucciones que se muestran abajo. 
        Para cada una de las versiones, ejecútalo varias veces, introduciendo cero para alguno de los valores 
        y finalmente explica la diferencia de comportamiento entre cada una de las versiones:
        • Versión a) if (b !=0 && a/b==0) {r = a/b; System.out.println(r);} 
        • Versión b) if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}
        • Versión c) if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}
        Puede ser el mismo código con las tres sentencias junta, teniendo una sola vigente y las otras 
        dos como comentarios. Comentando unas y descomentando otra vas probando cada caso. 
        La explicación puedes ponerla en el propio código, al final, como comentarios.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Introduce el valor de la variable A:");
            int a = scanner.nextInt();
        System.out.println("Introduce el valor de la variable B:");
            int b = scanner.nextInt();
        
        // Versión a) 
        if (b!=0 && a/b==0) {int r = a/b; System.out.println(r);}
          /* En la Version 1 --> esta mal declarada la variable "r" 
          * Por lo siguiente es un condicional que con el operador logico && (evalúa ambas condiciones siempre, incluso
          * si la primera ya es falsa)donde b debe tener un valor distinto de cero y el resultado de la division (a/b)
          * debe ser igual a 0. Por lo tanto, el valor de b debe ser distinto de cero y el valor de a debe ser menor al
          * valor almacenado en b para que la condicion se cumpla.
          * 
          * En caso contrario no se cumplira el condicional y el programa ignora el condicional de la version 1. */
           
        //Versión b)
        //if (a/b==0 && b!=0) {int r = a/b; System.out.println(r);} 
          /* En la Version 2 --> esta mal declarada la variable "r" 
          * Por lo siguiente es un condicional que con el operador logico && donde el resultado de la division (a/b)
          * debe ser igual a 0 y b debe tener un valor distinto de cero. 
          * Por lo tanto, el valor de a/b debe ser cero y el valor de a debe ser menor al valor almacenado en b 
          * para que la condicion se cumpla ya que esto resultaria en un valor numerico inferior a uno.  
          * 
          * En caso contrario no se cumplira el condicional y el programa ignora el condicional de la version 2. */
           
        //Versión c)
        //if (b !=0 & a/b==0) {int r = a/b; System.out.println(r);}
         /* En la Version 3 --> esta mal declarada la variable "r" 
         * Por lo siguiente es un condicional & que es mas estricto (operador lógico bit a bit)
         * Si uso en este condicional un & en lugar de dos &&, se fuerza la evaluación de ambas condiciones.
         * 
         * Si b es igual a 0, el código intentará ejecutar(a riesgo de interrumpir la ejecucion del programa)y por ende 
         * la segunda parte (a / b == 0), resultara una excepcion "ArithmeticException" por división a cero. la segunda
         * condición será evaluada aunque la primera sea falsa.
         *
         * En este caso se debe evitar la division por cero por lo anteriormente descrito para la version 3. */
    }
}
