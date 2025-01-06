
package t02_CalculosBasicos;
import java.util.*;
public class CalculoDelArea_Cuadrado {
    /*Realiza un programa en Java que calcule el área de un cuadrado dado el lado. El valor del
    lado será uno cualquiera*/
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);   
        System.out.print("Ingresa el lado del cuadrado:");
        double ladoRamdom = scanner.nextDouble();
        double area = ladoRamdom*ladoRamdom;
        
        System.out.printf("El resultado del area del cuadrado es: %.2f\n",area);
        
    }
}

