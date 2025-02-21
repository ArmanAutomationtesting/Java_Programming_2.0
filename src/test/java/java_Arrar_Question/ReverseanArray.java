package java_Arrar_Question;

import java.util.Arrays;

public class ReverseanArray {

    public static void main(String[] args) {
        int[] arr = {4,5,77,2,4,5,7,8,1,9};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
