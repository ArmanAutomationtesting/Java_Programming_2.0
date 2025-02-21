package java_Arrar_Question;

import java.util.Arrays;

public class RotateArrayYwice {

    public static void main(String[] args) {
        int time = 2;
        int[] arr = {1,2,3,4,5};
        reverse(arr,0, arr.length-1);
        reverse(arr,0,time-1);
        reverse(arr,time, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        return arr;
    }
}
