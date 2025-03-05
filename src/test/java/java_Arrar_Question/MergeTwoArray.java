package java_Arrar_Question;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr[] = {2,4,5,3,6,7};
        int arr1[] = {2,4,5,3,6,7};

        Integer[] result = new Integer[arr.length+arr1.length];
        int count = 0 ;

        for(int i=0; i< arr.length; i++){
            result[count] = arr[i];
            count++;
        }
        for(int i =0; i<arr1.length; i++){
            result[count] = arr1[i];
            count++;
        }

        System.out.println(Arrays.asList(result));


    }
}
