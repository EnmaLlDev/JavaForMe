
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;

public class e05_Conversion_Clima {
        /*Algoritmo para departamento de climatolog­a
        Un departamento de climatología ha realizado recientemente su conversión al sistema
        métrico. Diseñar un algoritmo para realizar las siguientes conversiones:
        • Leer por consola la temperatura dada en la escala Celsius y mostrar su equivalente
        Fahrenheit (la fórmula de conversión es “F=9/5 ºC+32”). Resultado redondeado a dos
        decimales.
        • Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su equivalente en
        centímetros (25.5 mm = 1 pulgada). Resultado redondeado a un decimal.*/
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperaturaUsuario, calcularFahrenheit, calcularCelsius;
        final double PULGADAS_CM = 2.54;
        double pluviometroPulgadas, calculoCentimetros, centimetros;
        
        //Resultado en grados Fahrenheit redondeado a 2 decimales
        System.out.println("Introduce la temperatura en grados Celsius ");
        temperaturaUsuario=scanner.nextDouble();
        
        //calcularFahrenheit = Math.round((9.0 / 5 * celsius + 32)*100)/100f;
        //calcularFahrenheit = Math.round((9 / 5.0 * celsius + 32)*100)/100.0;
        calcularFahrenheit= (9.0 / 5.0) * temperaturaUsuario + 32;
        //Con arrelo de formato
        System.out.printf("La temperatura en grados Fahrenheit es: %.2fF%n", calcularFahrenheit); 
        
        //Resultado en grados Celsius redondeado a 2 decimales
        System.out.println("Introduce la temperatura en grados Fahrenheit ");
        temperaturaUsuario=scanner.nextDouble();
        calcularCelsius=(5.0 / 9.0) * (temperaturaUsuario - 32); 
         //Con arrelo de formato
        System.out.printf("La temperatura en grados Celsius es: %.2fC%n", calcularCelsius);   
        
        //Leer la cantidad de agua del pluvimetro en pulgadas y mostrar su equivalente en centi­metros
         System.out.println("Introduce la cantidad de agua en pulgadas: ");
         pluviometroPulgadas=scanner.nextDouble();  //1 pulgada = 25.4 mm = 2.54 cm
                 
         //conversion a CM
         centimetros = pluviometroPulgadas*PULGADAS_CM;
         //Math.round(centimetros*10.0)/10.0;
         centimetros = Math.round(centimetros*10.0)/10.0;
         //Calculo directo
         calculoCentimetros=pluviometroPulgadas*2.54;
         
         System.out.printf(pluviometroPulgadas + " pulgadas equivalen a " + centimetros + " cm.");
         System.out.printf("La conversion en centimetros seria: %.1fCM%n", calculoCentimetros);
         scanner.close();
        
    }
}

