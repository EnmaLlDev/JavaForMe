package t04_Bucles;
import java.util.*;
public class e28_SumaMediaProducto_NumeroUsuario {
    /* Sacar por pantalla la suma, la media y el producto de los números pares comprendidos entre
    dos números enteros tecleados previamente. 
    No sabemos si el que introduce primero es menor que el segundo. 
    No incluir en los cálculos los números introducidos, solo los intermedios. */
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero para crear un rango");
        int inicioRango = scanner.nextInt();
        System.out.println("Introduce un numero para cerrar el rango");
        int finRango = scanner.nextInt();
        
        int suma=0;
        double media=0;
        int producto=0;
        int numerosPar=0;
        
        System.out.println("El rango esta entre: "+inicioRango+" hasta: "+finRango);
        
        for(int i=0;i<finRango;i+=2){
            numerosPar++;
            producto=i;
            System.out.println("---------------------------------------------");
            System.out.print(" - " +i+"\nContador de numeros pares: "+numerosPar);
            System.out.println("\nLa suma es:" + (suma+=i));
            System.out.println("La media es:" + (media=suma/numerosPar));
            System.out.println("La producto es:" + (producto*=i));
        }
        System.out.println("Fin del bucle");
        System.out.println("RESULTADOS:"+
                            "\nTotal de la susma: "+suma
                            +"\nTotal media: "+media
                            +"\nTotal del producto: "+producto);
    }
}

        
                
       
  

