package java_Arrar_Question;

import java.util.Arrays;

public class Action_sort {

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,9,6};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
