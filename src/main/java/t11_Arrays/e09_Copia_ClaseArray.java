package t11_Arrays;

/**
 * System.arraycopy (array origen, posición inicial, array destino, posición
 * inicial destino, cantidad de elementos a copiar). En nuestro ejemplo:
 */
public class e09_Copia_ClaseArray {

    public static void main(String[] args) {
        int[] edad = {18, 23, 13, 18, 14, 7};
        int[] copia = new int[]{1, 2, 3, 4, 5, 6};
        
        System.arraycopy(edad, 0, copia, 0, edad.length);

    }
}
