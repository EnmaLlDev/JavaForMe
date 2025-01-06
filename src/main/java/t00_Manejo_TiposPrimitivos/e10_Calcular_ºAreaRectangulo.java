
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;
public class e10_Calcular_ºAreaRectangulo {
        //Programa para calcular el area de un rectangulo
        public static void main(String[] args) {
        int x,y, area;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Dame la coodenada x:");
        x = scanner.nextInt();
        System.out.printf("Dame la coodenada y:");
        y = scanner.nextInt();
        area= Math.abs(x*y);
        System.out.printf("El area del rectangulo con dimensiones x=%d y y=%d es: %d\n", x, y, area);
        scanner.close(); 
    }
}
