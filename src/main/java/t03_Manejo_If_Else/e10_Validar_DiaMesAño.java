
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e10_Validar_DiaMesAño {
    /*  Realizar un programa al que se le introduzcan DIA, MES, AÑO, que verifique que los valores 
        introducidos sean correctos, sin emplear las clases de fechas de Java. 
    
        Si primero calculamos los días que tiene un mes/año, luego será muy fácil la verificación 
        de la fecha. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce un dia");
        int dia=scanner.nextInt();
        System.out.println("Introduce un mes");
        int mes=scanner.nextInt();
            System.out.println("Introduce un año");
        int año=scanner.nextInt();
        
        if (año > 0) {
            System.out.println("Año correcto!");

            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                System.out.println("El año es bisiesto!");

                if (mes == 2 && dia >= 1 && dia <= 29) {
                    System.out.println("Datos filtrados correctamente!");
                } else if (mes == 2 && (dia < 1 || dia > 29)) {
                    System.out.println("Error en los datos: día no válido para febrero en año bisiesto");
                }
            } else {
                System.out.println("El año " + año + " no es bisiesto.");
                // Validar febrero en año no bisiesto
                if (mes == 2 && dia >= 1 && dia <= 28) {
                    System.out.println("Febrero no bisiesto, mes correcto!");
                } else if (mes == 2 && dia > 28) {
                    System.out.println("Error: febrero en año no bisiesto solo tiene 28 días.");
                }
            }
            // Validar los meses con 31
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31) {
                System.out.println("Mes correcto! Grupo de 31 días.");
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31)) {
                System.out.println("Error: el mes " + mes + " solo tiene 31 días.");
            }

            // Validar los meses con 30
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
                System.out.println("Mes correcto! Grupo de 30 días.");
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
                System.out.println("Error: el mes " + mes + " solo tiene 30 días.");
            }

            if (mes < 1 || mes > 12) {
                System.out.println("Error: el mes " + mes + " no es válido. Debe estar entre 1 y 12.");
            }
        } else {
            System.out.println("Error: el año debe ser por lo menos mayor a 0.");
        }
    }
}