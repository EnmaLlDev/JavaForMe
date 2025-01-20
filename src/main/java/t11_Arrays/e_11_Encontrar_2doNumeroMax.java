
package t11_Arrays;

public class e_11_Encontrar_2doNumeroMax {
    public static void main(String[] args) {
        
        int[] array = {4, 2, 7, 1, 9, 7};
        try {
            System.out.println("El segundo valor máximo es: " + encontrarSegundoMaximo(array));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int encontrarSegundoMaximo(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("El array debe tener al menos dos elementos.");
        }

        int max = Integer.MIN_VALUE;
        int segundoMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                // Actualizamos max y el segundo máximo
                segundoMax = max;
                max = num;
            } else if (num > segundoMax && num < max) {
                // Actualizamos solo el segundo máximo
                segundoMax = num;
            }
        }

        if (segundoMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No existe un segundo máximo válido en el array.");
        }

        return segundoMax;
    }
}
