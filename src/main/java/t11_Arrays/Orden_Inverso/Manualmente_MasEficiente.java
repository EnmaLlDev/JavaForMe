
package t11_Arrays.Orden_Inverso;

public class Manualmente_MasEficiente {
    public static void main(String[] args) {
         int[] numeros = {5, 3, 8, 1, 2, 7};
         reverseManual(numeros);
            System.out.println("Array ordenado en orden manual:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
    public static void reverseManual(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
}