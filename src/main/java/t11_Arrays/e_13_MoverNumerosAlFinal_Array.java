
package t11_Arrays;
import java.util.Arrays;


public class e_13_MoverNumerosAlFinal_Array {

    public static void main(String[] args) {
        int[] miArray = {0, 1, 0, 3, 12, 0, 5};
        
        moverCerosAlFinal(miArray);

        System.out.println("Array modificado: " + Arrays.toString(miArray));
        }

        public static void moverCerosAlFinal(int[] array) {
        int index = 0; // Índice para elementos no cero

        // Mover elementos no cero hacia adelante
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }

        // Rellenar el resto del array con ceros
        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }
}
