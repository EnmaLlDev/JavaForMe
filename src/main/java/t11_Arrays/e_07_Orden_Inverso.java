
package t11_Arrays;

public class e_07_Orden_Inverso {
 public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 2, 7};

        // Llamar al método para ordenar el array
        ordenarDescendente(numeros);

        // Imprimir el array ordenado
        System.out.println("Array ordenado en orden inverso:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void ordenarDescendente(int[] array) {
        // Implementación del Bubble Sort en orden descendente
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // Intercambiar elementos si están en el orden equivocado
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}