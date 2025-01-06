
package t03_Manejo_If_Else;
import java.util.Scanner;

public class e08_HorarioAutobus_Algoritmo {
    /*La tabla siguiente representa las horas de salida de un bus. Diseña un algoritmo al que se le
    introduzca el día (1-7) y la hora (9-14), verifique la entrada y nos informe si hay bus o no. Hacer una
    primera condición que haga la verificación de la entrada de datos y otra única condición para ver si hay bus. */
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);

        System.out.println("Comprueba se existe algun bus disponible");
        System.out.println("Introduce un dia, segun se muestra el siguien formato:");
        System.out.println("1-> Lunes");
        System.out.println("2-> Martes");
        System.out.println("3-> Miércoles");
        System.out.println("4-> Jueves");
        System.out.println("5-> Viernes");
        System.out.println("6-> Sábado");
        System.out.println("7-> Domingo");
        int userDia=scanner.nextInt();
        System.out.println("Introduce un hora:");
        int userHora=scanner.nextInt();

        if((userDia==1||userDia==2||userDia==3||userDia==5 && userHora==10||userHora==14)||
                (userDia==4&&userHora==10||userHora==12||userHora==14)||
                (userDia==6&&userHora==10)||
                (userDia==7&&userHora>=9&&userHora<=14)){      
                System.out.println("Formato de dia y hora correcta,\nHay un auto bus disponible!");
        }else{System.out.println("En este horario no hay autobus disponible!");}   
    }
}
