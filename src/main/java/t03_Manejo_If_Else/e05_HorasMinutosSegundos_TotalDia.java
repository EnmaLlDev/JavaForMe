
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e05_HorasMinutosSegundos_TotalDia {
    /*  Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo 
    mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de 
    segundos transcurridos desde el comienzo del día. 
    
    No emplear las clases de fecha de Java.
    
    23:59:57 será una hora correcta y 25:61:88 será una hora incorrecta*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Introduce las horas:");
        int horas=scanner.nextInt();
        System.out.println("Introduce las minutos:");
        int minutos=scanner.nextInt();
        System.out.println("Introduce las segundos");
        int segundos=scanner.nextInt();
        
        int segundosTotales=(horas*3600)+(minutos*60)+segundos; //Transformacion a segundos
        
        if((horas>0 && horas<24)&&(minutos>=0&&minutos<60)&&(segundos>=0&&segundos<60))
            System.out.println("Correcto, formato valido.");
        else{System.out.println("Hora invalida!!!");}

        System.out.println("Relog digital:"+horas+":"+minutos+":"+segundos+
                        "\nEsto serian: "+segundosTotales+" segundos en total." );
    }               
  }  
