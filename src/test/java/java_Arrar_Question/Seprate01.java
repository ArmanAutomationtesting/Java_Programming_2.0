package java_Arrar_Question;

import java.util.Arrays;

public class Seprate01 {
    public static void main(String[] args) {

        int[] arr = {1,0,1,0,1,0};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.length-count; i++){
            arr[i] = 0;
        }
        for (int i = arr.length-count; i<arr.length; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
