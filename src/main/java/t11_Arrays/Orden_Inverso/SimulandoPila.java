
package t11_Arrays.Orden_Inverso;

public class SimulandoPila {
    public static void main(String[] args) {
         int[] numeros = {5, 3, 8, 1, 2, 7};
         reverseStackSimulation(numeros);
            System.out.println("Array ordenado en orden manual:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void reverseStackSimulation(int[] array) {
        int[] tempStack = new int[array.length];
        int index = 0;

        // Llenar el "stack"
        for (int i = array.length - 1; i >= 0; i--) {
            tempStack[index++] = array[i];
        }

        // Copiar de vuelta
        for (int i = 0; i < array.length; i++) {
            array[i] = tempStack[i];
        }
    }
}
