
package Ejercicios_funciones;
public class e01_calculaPeso_IA {
    /*1. Escribe una función en Java, calcularCoste(), con parámetros de entrada el peso y distancia del
    servicio de mensajería. Ambos parámetros son decimales. El valor devuelto por la función también
    será con decimales*/
    public static void main(String[] args) {
        // Ejemplo de uso de la función
        double peso = 7.5; // Peso en kg
        double distancia = 10; // Distancia en km

        double coste = calcularCoste(peso, distancia);
        System.out.println("El coste del servicio de mensajería es: " + coste + " €");
    }


    public static double calcularCoste(double peso, double distancia) {
        double costePeso = 0;
        double costeDistancia = 0;

        // Cálculo del coste basado en el peso
        if (peso <= 5) {
            costePeso = 6.0; // Cargo fijo para peso <= 5 kg
        } else {
            costePeso = 6.0 + (peso - 5) * 1.2; // Cargo fijo más adicional por cada kg extra
        }

        // Cálculo del coste basado en la distancia
        if (distancia <= 6) {
            costeDistancia = 4.2; // Cargo fijo para distancia <= 6 km
        } else {
            costeDistancia = 4.2 + (distancia - 6) * 1.4; // Cargo fijo más adicional por cada km extra
        }

        // Suma del coste total
        return costePeso + costeDistancia;
    }
}



