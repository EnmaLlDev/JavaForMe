package t11_Arrays;

public class e_10_RotarIzquierda_ArrayParametro {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int positions = 2;

        System.out.println("Array original: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        rotateLeft(array, positions);

        System.out.println("\nArray después de rotar a la izquierda " + positions + " posiciones: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] array, int positions) {
        if (array == null || array.length == 0 || positions < 0) {
            throw new IllegalArgumentException("Array no válido o número de posiciones negativo");
        }

        int n = array.length;
        // Asegurarse de que las posiciones estén dentro del rango del tamaño del array
        positions = positions % n;

        // **CAMBIO 1: Invertir los primeros 'positions' elementos**
        // En rotación a la izquierda, primero se invierten los elementos que serán desplazados al final.
        reverseArray(array, 0, positions - 1);

        // **CAMBIO 2: Invertir los elementos restantes**
        // Luego, se invierten los elementos que quedarán en el frente del array después de la rotación.
        reverseArray(array, positions, n - 1);

        // **CAMBIO 3: Invertir todo el array**
        // Finalmente, se invierte todo el array para colocar los elementos en el orden correcto después de la rotación.
        reverseArray(array, 0, n - 1);
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
