
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e11_Validar_DiaMesAnho_Operaciones {
    /*  Realizar un programa al que se le introduzcan DIA, MES, AÑO, que verifique que los valores 
        introducidos sean correctos, sin emplear las clases de fechas de Java. 
        
        Hay que hacer un tratamiento diferente según sea fin de año, fin de mes (no fin de año)
        o un día no fin de mes.
    
        Si primero calculamos los días que tiene un mes/año, luego será muy fácil la verificación 
        de la fecha. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce un dia");
        int dia=scanner.nextInt();
        System.out.println("Introduce un mes");
        int mes=scanner.nextInt();
            System.out.println("Introduce un año");
        int anho=scanner.nextInt();
        
        int diaSiguiente;
        
        //año
        if (anho <= 0) {
            System.out.println("Año inválido.");
        } else {
            // Verificar el mes
            if (mes < 1 || mes > 12) {
                System.out.println("Mes inválido.");
            } else {
                // mes
                int maxDias = 0;
                //31 dias
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    maxDias = 31;
                //30 dias
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    maxDias = 30;
                } else if (mes == 2) {
                    // Verificar si es un año bisiesto o no
                    if ((anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0)) {
                        maxDias = 29; // Febrero en año bisiesto
                    } else {
                        maxDias = 28; // Febrero en año no bisiesto
                    }
                }
                // día siguiente
                    if (dia == maxDias) {
                        dia = 1; // Reinicia el día
                        if (mes == 12) {
                            mes = 1; // Pasa al mes de enero
                            anho++;  // Pasa al año siguiente
                        } else {
                            mes++; // Pasa al mes siguiente
                        }
                    } else {
                        dia++; // Solo aumenta el día
                    }
                    
                // día
                if (dia < 1 || dia > maxDias) {
                    System.out.println("Día inválido.");
                } else {
                    if (mes == 12 && dia == 31) {
                        System.out.println("Es fin de año.");
                    } else if (dia == maxDias) {
                        System.out.println("Es fin de mes.");
                    } else {
                        System.out.println("Este dia no es fin de mes.");
                    }
                }
                  // resultado
                System.out.println("El dia siguiente es: " + dia + "/" + mes + "/" + anho);                
            }
        }
    }
}


 