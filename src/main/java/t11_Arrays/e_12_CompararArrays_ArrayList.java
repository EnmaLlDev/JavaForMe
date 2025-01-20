package t11_Arrays;


import java.util.Arrays;
import java.util.List;


public class e_12_CompararArrays_ArrayList {

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};

        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);

        boolean areEqual = list1.equals(list2);
        System.out.println("Son iguales: " + areEqual); // true

    }
}
