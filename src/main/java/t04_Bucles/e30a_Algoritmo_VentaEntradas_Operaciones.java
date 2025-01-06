package t04_Bucles;
import java.util.*;
public class e30a_Algoritmo_VentaEntradas_Operaciones {
    /* Modificar el programa anterior para que si un cliente introduce un número negativo o mayor
    que 10 le informe de su error y le obligue a meter correctamente las entradas que desea, las veces
    que sea necesario hasta que lo haga bien.*/
    
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
            try{
                System.out.println("----------------------------------------"); 
                System.out.print("User: "+nro_user+"\nCuantas entradas compras:");
                compra_entradas = scanner.nextInt();
                
                if(compra_entradas<=0){
                   System.out.println("Error: Introduce numeros postitivos!");
                }
                if(compra_entradas>limite_cliente){
                    System.out.println("Error: Superaste el limite!");
                }
                if(compra_entradas>entradas){
                     System.out.println("Error: No tenemos esa cantidad disponible");
                     System.out.println("Entradas disponibles:"+(entradas-=compra_entradas));
                    }
                if(compra_entradas>0&&compra_entradas<10){
                        System.out.println("Compra correcta");
                        System.out.println("Entradas disponibles:" + (entradas-=compra_entradas));
                        System.out.println("Registro -> " + contador_compras); 
                }         
                
            }catch(Exception excep){
                System.out.println(excep);
                }
            }
        if(entradas==0) System.out.println("Se agotaron las entradas!\nFin del programa.");
        else{ System.out.println("Ha ocurrido un error!!!\nFin del programa.");} 
    }
}

        
                
       
  

  

