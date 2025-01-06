
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e13c_Notas_Operaciones_IfElse2 {
    /* Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos 
    muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2), 
    Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). Haz una versión con if 
    anidados, otra con switch + “case :” y otra con switch + “case ->” */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar la nota
        System.out.println("Introduce la nota:");
        int nota = scanner.nextInt();
        // Condicionales if
        if(nota>0 && nota<=10){
            if (nota<= 2){System.out.println("Muy Deficiente");} 
            else if (nota<=4){System.out.println("Insuficiente");}
            else if (nota<=6){System.out.println("Aprobado");} 
            else if (nota<=8){System.out.println("Notable");} 
            else if (nota<=10){System.out.println("Sobresaliente");}
        }else { System.out.println("Nota invalida, el valor debe estar entre 1 - 10.");}
    }
}
