package t04_Bucles;
import java.util.*;
public class e30b_Algoritmo_VentaEntradas_Operaciones2 {
    /* Modificar el programa anterior para que si un cliente introduce un número negativo o mayor
    que 10 le informe de su error y le obligue a meter correctamente las entradas que desea, las veces
    que sea necesario hasta que lo haga bien.*/
    
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de entradas disponibles:");
        int entradas = scanner.nextInt();
        
        int compra_entradas = 0;
        int contador_compras = 0;
        int nro_user = 0;
        final int limite_cliente = 10;
        
        while (entradas > 0) {
            nro_user++;
            contador_compras++;
            
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.println("----------------------------------------"); 
                    System.out.print("Usuario: " + nro_user + "\nCuantas entradas compras?: ");
                    compra_entradas = scanner.nextInt();
                    
                    if (compra_entradas <= 0) {
                        System.out.println("Error: Introduce numeros positivos!");
                    } else if (compra_entradas > limite_cliente) {
                        System.out.println("Error: Superaste el limite de " + limite_cliente + " entradas por cliente!");
                    } else if (compra_entradas > entradas) {
                        System.out.println("Error: No tenemos esa cantidad disponible.");
                        System.out.println("Entradas disponibles: " + entradas);
                    } else {
                        entradaValida = true; // La entrada es válida, salir del bucle
                    }
                } catch (InputMismatchException excep) {
                    System.out.println("Error: Por favor, introduce un número válido.");
                    scanner.next(); // Limpiar la entrada no válida
                }
            }
            
            // Reducir el número de entradas disponibles después de una compra válida
            entradas -= compra_entradas;
            System.out.println("Compra correcta");
            System.out.println("Entradas disponibles: " + entradas);
            System.out.println("Registro -> " + contador_compras);
        }
        
        System.out.println("¡Se agotaron las entradas!\nFin del programa.");
        scanner.close();
    }
}
                
       
  

  

