
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e13a_Notas_Operaciones {
    /* Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos 
    muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2), 
    Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). Haz una versión con if 
    anidados, otra con switch + “case :” y otra con switch + “case ->” */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Primera fecha
            System.out.println("Introduce la nota:");
        int nota=scanner.nextInt();
        
        switch (nota) {
                case 0,1,2 ->{System.out.println("Muy Deficiente");}
                case 3,4 -> {System.out.println("Insuficiente");}
                case 5,6 -> {System.out.println("Aprobado");}
                case 7,8 -> {System.out.println("Notable");}
                case 9,10 -> {System.out.println("Sobresaliente");}
                default -> {System.out.println("Intenta denuevo!!!"); }
        }
        
        //Switch de otra forma 
        /*switch (nota) {
            case 0,1,2:{System.out.println("Muy Deficiente");break;}
            case 3,4: {System.out.println("Insuficiente");break;}
            case 5,6: {System.out.println("Aprobado");break;}
            case 7,8: {System.out.println("Notable");break;}
            case 9,10: {System.out.println("Sobresaliente");break;}
            default: {System.out.println("Intenta denuevo!!!");break;}
        }*/
    }
}