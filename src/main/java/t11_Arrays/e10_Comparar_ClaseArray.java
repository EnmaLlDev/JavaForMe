package t11_Arrays;

import java.util.Arrays;

public class e10_Comparar_ClaseArray {

    /*
    tenemos el método: Arrays.equals
    (nombreArray1, nombreArray2), que devuelve true si son iguales y false en caso contrario.
     */
    public static void main(String[] args) {

        int[] edad = {18, 23, 13, 18, 14, 7};
        int[] copia = new int[]{1, 2, 3, 4, 5, 6};
        
        if (Arrays.equals (edad,copia) == true) {System.out.println("Son iguales"); 
       }else{System.out.println("No son iguales");}
    }
}
