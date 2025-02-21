package java_Arrar_Question;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11};

        Integer[] arr = new Integer[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr[count] = arr1[i];
            count++;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[count] = arr2[i];
            count++;
        }

            System.out.println(Arrays.toString(arr));

    }
}
