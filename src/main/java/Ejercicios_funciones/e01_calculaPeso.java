
package Ejercicios_funciones;
import java.util.Scanner;
public class e01_calculaPeso {
    /*1. Escribe una función en Java, calcularCoste(), con parámetros de entrada el peso y distancia del
    servicio de mensajería. Ambos parámetros son decimales. El valor devuelto por la función también
    será con decimales*/
 public static void main(String[] args) { // CLASS MAIN
        Scanner scanner = new Scanner(System.in);
        
        /*Validacion peso y distancia*/
        System.out.println("introduce peso");
        double peso=scanner.nextDouble();
        System.out.println("introduce distancia");
        double distancia=scanner.nextDouble();

        if(peso>0 && distancia>0)System.out.println("El costo del envio sera de: "+calcularCoste(peso,distancia)+" $");
        else System.out.println("Valores icorrectos!");
 }
    

    public static double calcularCoste(double peso, double distancia){
    double coste=0;
    double costePeso=6;
    double costeDistancia=4.2;
    double difPeso=peso-5;
    double difDistancia=distancia-6;
    
    //calculoPeso
    if(peso<=5) coste+=6;
    if(peso>5) coste+=(1.2*difPeso)+costePeso; 
    //calculoDistancia
    if(distancia<=6) coste+=4.2;
    if(distancia>6) coste+=(1.4*difDistancia)+costeDistancia; 
    
    return coste;
    }
}
