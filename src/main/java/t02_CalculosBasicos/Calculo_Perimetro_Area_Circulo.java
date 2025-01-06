package t02_CalculosBasicos;
import java.util.Scanner;
public class Calculo_Perimetro_Area_Circulo {
    /* Realiza un programa en Java que clacule y muestre por pantalla el perimetro y el area de un circulo.
    El valor del radio sera de tipo double y asignamos nosotros uno cualquiera. El valor de PI, lo definimos
    como una constante tambiende tipo double.*/
     public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);   
        System.out.print("Ingresa el valor del radio de un circulo:");
        double radio = scanner.nextDouble();
        double perimetro = 2*Math.PI*radio;
        double area = Math.PI*Math.pow(radio, 2);
        
        System.out.printf("El resultado del area es: %.2f\n", area);    
        System.out.printf("El resultado del perimetro es: %.2f\n", perimetro);
    }
}
    
