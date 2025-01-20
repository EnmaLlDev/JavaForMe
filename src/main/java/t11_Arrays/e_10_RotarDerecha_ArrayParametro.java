package t11_Arrays;

public class e_10_RotarDerecha_ArrayParametro {

public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int positions = 2;

        System.out.println("Array original: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        rotateRightSimple(array, positions);

        System.out.println("\nArray después de rotar a la derecha " + positions + " posiciones: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateRightSimple(int[] array, int positions) {
        if (array == null || array.length == 0 || positions < 0) {
            throw new IllegalArgumentException("Array no válido o número de posiciones negativo");
        }

        int n = array.length;
        positions = positions % n; // Asegurar que las posiciones estén dentro del rango del array

        // Realizar rotaciones según el número de posiciones
        for (int i = 0; i < positions; i++) {
            rotateOnce(array);
        }
    }

    private static void rotateOnce(int[] array) {
        int n = array.length;
        int last = array[n - 1]; // Guardar el último elemento

        // Mover todos los elementos una posición hacia la derecha
        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last; // Colocar el último elemento al inicio
    }
}
