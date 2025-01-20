package t11_Arrays;

import java.util.Arrays;

public class e_12_CompararArrays_equals {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean sonIguales = Arrays.equals(array1, array2);
        System.out.println("Resultado: "+ sonIguales);
    
    }
}
