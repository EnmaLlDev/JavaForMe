package t11_Arrays.Orden_Inverso;

public class NuevoArray {

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 2, 7}; //conserva el array original

        System.out.println("Array ordenado en orden manual:");
        for (int num :reverseNewArray(numeros)) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverseNewArray(int[] array) {
        int n = array.length;
        
        int[] reversed = new int[n];//nuevo array
        
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];
        }
        return reversed;//devueve un nuevo array
    }
}
