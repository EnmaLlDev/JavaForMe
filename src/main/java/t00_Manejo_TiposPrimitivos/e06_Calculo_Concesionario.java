
package t00_Manejo_TiposPrimitivos;

import java.util.Scanner;

public class e06_Calculo_Concesionario {
       /*Cocesionario automoviles
        El coste de un automóvil nuevo para un comprador es la suma total del coste de fábrica del
        vehículo, más el porcentaje de la ganancia de la tienda (que se aplica sobre el coste de fábrica) y
        añadiéndole finalmente los impuestos estatales aplicables (sobre el precio de venta calculado ya con
        beneficio de la tienda).
        Suponiendo una ganancia de tienda de 10% y un impuesto del 20%, realiza un programa que lea por
        consola el coste inicial del automóvil y calcule el coste para el consumidor.*/
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 

        final double PORCENTAJE_GANANCIA= 0.10; 
        final double TASAS_ESTADO= 0.20;

        System.out.println("Introduce el costo de fabricacion del coche:");
        double costeFabrica=scanner.nextDouble();

        double gananciaTienda = costeFabrica * PORCENTAJE_GANANCIA;
        double costeMasTienda = costeFabrica + gananciaTienda;

        double impuesto = costeMasTienda * TASAS_ESTADO;

        double costeTotal=costeMasTienda + impuesto ;

        //Formatos 2 decimales + euros + \n 
        System.out.printf("El costo inicial seria: %.2f euros\n", costeFabrica);
        System.out.println("En impuestos seria: %.2f euros\n" + impuesto);
        System.out.println("La ganacia de la tienda seria: %.2f euros\n" + gananciaTienda);
        System.out.printf("El costo para el consumidor seria: %.2f euros\n", costeTotal);

        scanner.close();
     }
}
