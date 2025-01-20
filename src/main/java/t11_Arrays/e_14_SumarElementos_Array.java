package t11_Arrays;

import java.util.Arrays;

public class e_14_SumarElementos_Array {

    public static void main(String[] args) {
        int[] Array1 = {0, 1, 0, 3, 12, 0, 5};
        int[] Array2 = {3, 2, 1, 2, 13, 0, 1};
        
        System.out.println("Resultado suma: "+ Arrays.toString(SumarElementos(Array1, Array2)));
    }
    
    public static int[] SumarElementos(int[] array1, int[] array2){
        int[] suma= new int[array1.length];
        int var1=0;
        int var2=0;
        int resultado=0;
        
        for (int i = 0; i < array1.length; i++) {
            var1=array1[i];
            var2=array2[i];
            
            resultado=var1+var2;
            suma[i]=resultado;
        }
        return suma;
    } 
}
