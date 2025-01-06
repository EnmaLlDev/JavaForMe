package t01_Ejercicios_Numericos;
import java.util.Scanner;
public class ejercicios_20_triangulo {
    /* 10
    Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
    */
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura:");
        int altura = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Introduce un caracter pra dibujar la piramide:");
        char caracter = scanner.next().charAt(0); // Tomar solo el primer carácter del string
       
        //forma general de la piramide
        /*for(int i=1;i<=altura;i++){
            
           for(int j=1;j<=altura-i;j++){
               System.out.print(" ");
           }
           for(int k=1; k<=(2*i-1);k++){
            System.out.print(caracter);
           }
        System.out.println();
       }*/       
             // tamaño de la pirámide hueca
        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco para centrar la pirámide
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Caracteres de la pirámide
            for (int k = 1; k <= (2 * i - 1); k++) {
                // Imprimir el carácter solo en los bordes, principio y fuinal del rango
                if (k == 1 || k == (2 * i - 1) || i == altura) {
                    System.out.print(caracter); // Dibujar el carácter
                } else {
                    System.out.print(" "); // Espacios en el interior de la pirámide
                }
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
