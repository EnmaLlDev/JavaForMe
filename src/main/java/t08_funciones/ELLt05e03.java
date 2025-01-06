package t08_funciones;
import java.util.Scanner;
public class ELLt05e03 {
    /*5.3. Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes y 
    devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos.  A continuación, realizar
    un programa al que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero 
    de ese año (no usar clases Java de fechas).*/
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce anho:");
        int anho = scanner.nextInt();
        System.out.println("Introduce mes:");
        int mes = scanner.nextInt();

        if(esBisiesto(anho)){
            System.out.println("Año es bisiesto.");
        }else{
            System.out.println("No bisieto!");
        }
        System.out.println("Cantidad de días desde Enero hasta el mes " + mes + ": "+calcularDiasMes(anho, mes)+" dias");
        
    }
    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int anho) {
        return (anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0);
    }

    // Método para calcular los días desde Enero hasta el mes dado
    public static int calcularDiasMes(int anho, int mes) {
        int diasAcumulados = 0;

        // Verificar si el mes es válido
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes inválido. Debe estar entre 1 y 12.");
        }

        // Calcular los días acumulados hasta el mes dado
        for (int i = 1; i < mes; i++) {
            if (i == 2) {  // Febrero
                if (esBisiesto(anho)) {
                    diasAcumulados += 29; // Año bisiesto
                } else {
                    diasAcumulados += 28; // Año no bisiesto
                }
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {  // Meses con 30 días
                diasAcumulados += 30;
            } else {  // Meses con 31 días
                diasAcumulados += 31;
            }
        }
        
        // Sumar los días del mes indicado
        if (mes == 2) {
            if (esBisiesto(anho)) {
                diasAcumulados += 29;  // Febrero en año bisiesto
            } else {
                diasAcumulados += 28;  // Febrero en año no bisiesto
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {  // Meses con 30 días
            diasAcumulados += 30;
        } else {  // Meses con 31 días
            diasAcumulados += 31;
        }

        return diasAcumulados;
    }
}
