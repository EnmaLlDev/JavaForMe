package t04_Bucles;
import java.util.*;
public class e29_Algoritmo_VentaEntradas {
    /* Hacer un programa para llevar el control de venta de entradas. 
    1.- Lo primero que ha de hacer es pedir la cantidad de entradas que se pondrán a la venta, 
    2.- después irá solicitando la cantidad de entradas que quiere comprar, 
    3.- estando limitado a un máximo de 10 por cliente. 
    4.- El programa finalizará cuando se agoten las entradas mostrando la cantidad de entradas
        que se ha llevado el que más ha comprado. 
    
    **Pensar primero el bucle y luego lo que hay que hacer en cada iteración */
    
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de entradas disponibles:");
        int entradas = scanner.nextInt();
        
        int compra_entradas=0;
        int contador_compras=0;
        int nro_user=0;
        final int limite_cliente=10;
        
        while(entradas>0){
            nro_user++;
            contador_compras++;
          
            System.out.println("----------------------------------------"); 
            System.out.print("User: "+nro_user+"\nCuantas entradas compras:");
            compra_entradas = scanner.nextInt();
                
            if(compra_entradas>limite_cliente){
                    System.out.println("Superaste el limite!");
                    break;
            }else if(compra_entradas>entradas){
                     System.out.println("No tenemos esa cantidad disponible");
                     System.out.println("Entradas disponibles:"+(entradas-=compra_entradas)); 
                     break;
            }else{
                    if(compra_entradas>0&&compra_entradas<10){
                        System.out.println("Compra correcta");
                        System.out.println("Entradas disponibles:" + (entradas-=compra_entradas));
                        System.out.println("Registro -> " + contador_compras); 
                    }         
            } 
            System.out.println("");
        }
           
        if(entradas==0) System.out.println("Se agotaron las entradas!\nFin del programa.");
        else{ System.out.println("Ha ocurrido un error!!!\nFin del programa.");} 
    }
}

        
                
       
  

