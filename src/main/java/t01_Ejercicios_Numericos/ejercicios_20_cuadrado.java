package t01_Ejercicios_Numericos;
import java.util.Scanner;
public class ejercicios_20_cuadrado {
    /* 10
    Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
    */
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
     // Pedir el tamaño del cuadrado
        System.out.print("Introduce el tamaño del cuadrado: ");
        int tamaño = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Pedir el carácter con el que se dibujará el cuadrado
        System.out.print("Introduce el carácter para el cuadrado: ");
        char caracter = scanner.nextLine().charAt(0); // Tomar solo el primer carácter

        // Dibujar el cuadrado
        /*for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                System.out.print(caracter + " "); // Imprimir el carácter seguido de un espacio
            }
            System.out.println(); // Salto de línea después de cada fila
        }*/
        //Imprime solo los bordes
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                 
                if (i == 1 || i == tamaño || j == 1 || j == tamaño) {
                    System.out.print(caracter); // Dibujar el carácter
                } else {
                    System.out.print(" "); // Espacios en el interior de la pirámide
                }
                
                System.out.print(" "); // Imprimir el carácter seguido de un espacio
            }
            System.out.println(" "); // Salto de línea después de cada fila
        }
    }
}
