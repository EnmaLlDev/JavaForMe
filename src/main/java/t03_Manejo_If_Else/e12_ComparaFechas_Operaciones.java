
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e12_ComparaFechas_Operaciones {
    /*  Introduciendo dos fechas (día, mes, año), hacer un programa que nos diga cuál de las dos es 
    mayor (agrupa las condiciones de día, mes y año en una sola sentencia condicional). Suponemos que 
    se introducen fechas válidas y no empleamos las clases de fecha de Java */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Primera fecha
            System.out.println("Introduce un dia");
        int dia1=scanner.nextInt();
            System.out.println("Introduce un mes");
        int mes1=scanner.nextInt();
            System.out.println("Introduce un año");
        int anho1=scanner.nextInt();
        
         // Validacion
        boolean esBisiesto1 = (anho1 % 4 == 0 && anho1 % 100 != 0) || (anho1 % 400 == 0);
        if (mes1 < 1 || mes1 > 12) {
            System.out.println("La primera fecha es inválida (mes incorrecto).");
            return;
        }
        if (dia1 < 1 || (mes1 == 2 && (esBisiesto1 ? dia1 > 29 : dia1 > 28)) ||
                ((mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) && dia1 > 30) || (dia1 > 31)) {
            System.out.println("La primera fecha es inválida (día incorrecto).");
            return;
        }
        
        // Segundo grupo
            System.out.println("Introduce un dia");
        int dia2=scanner.nextInt();
            System.out.println("Introduce un mes");
        int mes2=scanner.nextInt();
            System.out.println("Introduce un año");
        int anho2=scanner.nextInt();
        
        // Validar la segunda fecha
        boolean esBisiesto2 = (anho2 % 4 == 0 && anho2 % 100 != 0) || (anho2 % 400 == 0);
        if (mes2 < 1 || mes2 > 12) {
            System.out.println("La segunda fecha es inválida (mes incorrecto).");
            return;
        }
        if (dia2 < 1 || (mes2 == 2 && (esBisiesto2 ? dia2 > 29 : dia2 > 28)) ||
                ((mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11) && dia2 > 30) || (dia2 > 31)) {
            System.out.println("La segunda fecha es inválida (día incorrecto).");
            return;
        }
        
        
        if (anho1 > anho2 || (anho1 == anho2 && mes1 > mes2) || (anho1 == anho2 && mes1 == mes2 && dia1 > dia2)) {
            System.out.println("La primera fecha es mayor.");
        } else if (anho1 < anho2 || (anho1 == anho2 && mes1 < mes2) || (anho1 == anho2 && mes1 == mes2 && dia1 < dia2)) {
            System.out.println("La segunda fecha es mayor.");
        } else {
            System.out.println("Las dos fechas son iguales.");
        } 
    
    }
}