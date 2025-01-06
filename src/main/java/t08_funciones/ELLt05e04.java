package t08_funciones;
import java.util.Scanner;

public class ELLt05e04 {
/*5.4. Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan 
dos fechas del mismo año y nos informe de los días comprendidos entre ellas 
(no usar clases Java de fechas). */
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int fecha_1=0,fecha_2=0;
        int anho=0, mes=0, fecha=0, diferenciaDias=0;
        
        for(int i=1;i<=2;i++){
            System.out.println("Introduce anho:");
            anho = scanner.nextInt();
            System.out.println("Introduce mes:");
            mes = scanner.nextInt();
            
            if(esBisiesto(anho)){System.out.println("Año es bisiesto.");
            }else{System.out.println("No bisieto!");}
            
            fecha=calcularDiasMes(anho, mes);
            
            if(i==1)fecha_1=fecha;
            if(i==2){
                fecha_2=fecha; 
                diferenciaDias=calcularDiferencia(fecha_1,fecha_2);
                System.out.println("Derencia entre la primera y segunda fecha es:" + diferenciaDias);
            } 
        }
        System.out.println("Programa finalizado1"); 
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
    
    // Método para calcular la diferenica de los dias, REFACTORIZAR A OBJETOS 
    public static int calcularDiferencia(int primeraFecha, int segundaFecha){
        return Math.abs(primeraFecha-segundaFecha);
    }
}
