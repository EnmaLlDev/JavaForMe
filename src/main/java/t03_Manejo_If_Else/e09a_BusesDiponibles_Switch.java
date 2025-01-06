
package t03_Manejo_If_Else;
import java.util.Scanner;

public class e09a_BusesDiponibles_Switch {
    /*Realizar un programa al que se le introduzca la hora del día (0 –23) y nos diga que días de la
    semana hay salida de bus (utilizar la tabla anterior).*/
    
    public static void main(String[] args) {
       Scanner scanner =new Scanner (System.in);
      
        System.out.println("Introduce un hora, para saber que dias hay autobus disponible:");
        int userHora=scanner.nextInt();
        if (userHora>0&&userHora<24){
            switch(userHora){
                case 1,2,3,4,5,6,7,8 -> {System.out.println("No hay autobus disponible en este horario");}
                case 9 -> {System.out.println("Autobus disponible el dia DOMINGO en este horario");}
                case 10 -> {System.out.println("Autobus disponible los dias LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO y DOMINGO en este horario");}
                case 11 -> {System.out.println("Autobus disponible el dia DOMINGO en este horario");}
                case 12 -> {System.out.println("Autobus disponible los dias JUEVES y DOMINGO en este horario");}
                case 13 -> {System.out.println("Autobus disponible el dia DOMINGO en este horario");}
                case 14 -> {System.out.println("Autobus disponible los dias LUNES, MARTES, MIERCOLES, JUEVES, VIERNES y DOMINGO en este horario");}
                case 15,16,17,18,19,20,21,22,23 -> {System.out.println("No hay autobus disponible en este horario");}
                default -> {System.out.println("Formato de hora invalido!");}   
            }
        }else System.out.println("Formato de fecha invalido!");
    }
}