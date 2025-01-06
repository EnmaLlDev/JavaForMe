
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;
public class e07_Calculo_Combustible {
        /* programa para introducirlo en el ordenador de a bordo de
        nuestro coche y que nos informe del consumo medio del coche cada 100 km. Diseña un programa
        al que le introduzcamos el kilometraje de la última vez que se repostó, el kilometraje actual, los litros
        de gasolina que tenía al finalizar la última vez que repostó y la cantidad de gasolina actual.*/
        public static void main(String[] args) {   
        double kmAnterior,kmActual,litrosAnterior, litrosActual, distanciaRecorrida, combustibleConsumido, consumoMedio;
    
        Scanner scanner = new Scanner(System.in); 

        // Solicitar datos al usuario
        System.out.print("Introduce el kilometraje de la ultima vez que repostaste: ");
        kmAnterior = scanner.nextDouble();

        System.out.print("Introduce el kilometraje actual: ");
        kmActual = scanner.nextDouble();

        System.out.print("Introduce los litros de gasolina al finalizar el ultimo repostaje: ");
        litrosAnterior = scanner.nextDouble();

        System.out.print("Introduce la cantidad de gasolina actual: ");
        litrosActual = scanner.nextDouble();
        
        scanner.close();
        
        //Validaciones para evitar errores de prueba
        if (kmActual <= kmAnterior) {
            System.out.println("Error: El kilometraje actual debe ser mayor que el kilometraje anterior.");
            return;
            }
        if (litrosActual >= litrosAnterior) {
            System.out.println("Error: La cantidad actual de gasolina debe ser menor que la cantidad al finalizar el ulltimo repostaje.");
            return;
            }
           
        distanciaRecorrida = kmActual-kmAnterior;
        combustibleConsumido = litrosAnterior-litrosActual;
        
        consumoMedio=(combustibleConsumido/distanciaRecorrida)*100;
        
        System.out.printf("El consumo medio del coche cada 100 Km es: %.2f litros%n", consumoMedio);

    }
}

