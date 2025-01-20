package t11_Arrays;

import java.util.Scanner;

public class e_15_Palidromo_Arrays {
    public static void main(String[] args) {
   int[] testArray1 = {1, 2, 50, 2, 1};
        int[] testArray2 = {1, 4, 0, 4, 1};

        System.out.println("¿El primer array es un palíndromo? " + isPalindrome(testArray1));
        System.out.println("¿El segundo array es un palíndromo? " + isPalindrome(testArray2));
    
    }
        public static boolean isPalindrome(int[] array) {
        int left = 0; // Índice inicial
        int right = array.length - 1; // Índice final

        while (left < right) {
            if (array[left] != array[right]) {
                return false; // Si los elementos no coinciden, no es un palíndromo
            }
            left++;
            right--;
        }

        return true; // Si recorremos todo el array y los elementos coinciden, es un palíndromo
    }
}
