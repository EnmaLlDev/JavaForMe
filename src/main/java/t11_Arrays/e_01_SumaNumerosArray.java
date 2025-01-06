/* Programa con enteros que los suma todos */
package t11_Arrays;
public class e_01_SumaNumerosArray {
    public static void main(String[] args) {
         int[] arreglo_Enteros = {1,2,3,4,5,6};
         int acumulador=0;
        
         for (int entero:arreglo_Enteros){
             System.out.println("Numero:"+entero);
             acumulador += entero;
         }
         System.out.println("El resultado de la suma es: "+acumulador);
        
    }          
}
