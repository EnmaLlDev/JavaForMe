
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e14_LetraDni_Swtich {
    /*  Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI. Consiste 
    en dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente 
    según la siguiente tabla (Hacer con switch, no empleando ni arrays ni String */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los numeros de tu DNI:");
        int numeroDNI = scanner.nextInt();
        int resto=numeroDNI%23;
        
        switch(resto){
            case 0 -> {System.out.println((numeroDNI)+"T");}
            case 1 -> {System.out.println((numeroDNI)+"R");}
            case 2 -> {System.out.println((numeroDNI)+"W");}
            case 3 -> {System.out.println((numeroDNI)+"A");}
            case 4 -> {System.out.println((numeroDNI)+"G");}
            case 5 -> {System.out.println((numeroDNI)+"M");}
            case 6 -> {System.out.println((numeroDNI)+"Y");}
            case 7 -> {System.out.println((numeroDNI)+"F");}
            case 8 -> {System.out.println((numeroDNI)+"P");}
            case 9 -> {System.out.println((numeroDNI)+"D");}
            case 10 -> {System.out.println((numeroDNI)+"X");}
            case 11 -> {System.out.println((numeroDNI)+"B");}
            case 12 -> {System.out.println((numeroDNI)+"N");}
            case 13 -> {System.out.println((numeroDNI)+"J");}
            case 14 -> {System.out.println((numeroDNI)+"Z");}
            case 15 -> {System.out.println((numeroDNI)+"S");}
            case 16 -> {System.out.println((numeroDNI)+"Q");}
            case 17 -> {System.out.println((numeroDNI)+"V");}
            case 18 -> {System.out.println((numeroDNI)+"H");}
            case 19 -> {System.out.println((numeroDNI)+"L");}
            case 20 -> {System.out.println((numeroDNI)+"C");}
            case 21 -> {System.out.println((numeroDNI)+"K");}
            case 22 -> {System.out.println((numeroDNI)+"E");}
            default -> {System.out.println((numeroDNI)+" Arroja un valor dsitinto al deseado."
                                                           + "\n Intentalo denuevo!");}

        }
    }
}
