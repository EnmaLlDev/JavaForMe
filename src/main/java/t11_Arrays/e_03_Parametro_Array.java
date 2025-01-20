package t11_Arrays;
public class e_03_Parametro_Array {
    public static void main(String[] args) {
         int[] arreglo_Enteros = {1,2,3,4,5,6};
         int acumulador=0;

         for (int entero:arreglo_Enteros){
             System.out.println("Numero:"+entero);
             acumulador += entero;
         }
         System.out.println("El promedio es: "+ acumulador/arreglo_Enteros.length);  
         
         CalcularPromedio(arreglo_Enteros);
    }
        
    public static void CalcularPromedio(int[] miArray) {

         int acumulador=0;
         for (int entero:miArray){
             System.out.println("Numero:"+entero);
             acumulador += entero;
         }
         
         System.out.println("El promedio con fucion es: "+ acumulador/miArray.length);  
    }

}


    
