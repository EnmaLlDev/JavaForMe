package t11_Arrays;

import java.util.Scanner;

public class e_10_RotaDerecha_CualquierPosicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Cuantas posiciones se rota a la derecha: ");
        int positions = scanner.nextInt();

        System.out.println("Array original: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        rotateRight(array, positions);

        System.out.println("\nArray después de rotar a la derecha " + positions + " posiciones: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
        public static void rotateRight(int[] array, int positions) {
        if (array == null || array.length == 0 || positions < 0) {
            throw new IllegalArgumentException("Array no válido o número de posiciones negativo");
        }

        int n = array.length;
        // Asegurarse de que las posiciones estén dentro del rango del tamaño del array
        positions = positions % n;

        // Paso 1: Invertir todo el array
        reverseArray(array, 0, n - 1);

        // Paso 2: Invertir los primeros 'positions' elementos
        reverseArray(array, 0, positions - 1);

        // Paso 3: Invertir los elementos restantes
        reverseArray(array, positions, n - 1);
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
