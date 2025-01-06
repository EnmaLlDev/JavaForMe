
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e01j_Compara2Numeros_Divisores {
    /* Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir
    divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer
    un solo if */
    
    //TODO:agrupar en un solo if
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce el primer numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce el segundo numero:");
        int userNumber2=scanner.nextInt();
        int mayor =  Math.max(userNumber1, userNumber2);
        int menor =  Math.min(userNumber1, userNumber2);
       try {
        if (userNumber2 != 0 && mayor % menor == 0) {
            System.out.println("El número mayor es: " + mayor + "\nEl número menor es: " + menor + "\n" + menor + " es divisor de " + mayor);
        } else {
            if (userNumber2 == 0) {
                System.out.println("Error: has introducido un divisor de cero!");
            } else {
                System.out.println(menor + " no es divisor de " + mayor);
            }
        }
    } catch (ArithmeticException e) {
        System.out.println("Error: imposible dividir entre cero");
    }
  }  
}