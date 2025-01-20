
package t11_Arrays;

public class e_08_Elminar_Elemento_Array {
    
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int indiceEliminar = 2; // Por ejemplo, queremos eliminar el elemento en la posición 2 (el número 3)
        
        
        // Validamos que el índice a eliminar sea válido
        if (indiceEliminar < 0 || indiceEliminar >= arrayOriginal.length) {
            System.out.println("Índice inválido");
            return;
        }

        // Creamos un nuevo array con un tamaño menor
        int[] nuevoArray = new int[arrayOriginal.length - 1];

        // Copiamos los elementos, omitiendo el que queremos eliminar
        int j = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (i != indiceEliminar) {
                nuevoArray[j] = arrayOriginal[i];
                j++;
            }
        }

        // Imprimimos el nuevo array
        System.out.println("Array después de eliminar el elemento:");
        for (int num : nuevoArray) {
            System.out.print(num + " ");
        }
    }
}
