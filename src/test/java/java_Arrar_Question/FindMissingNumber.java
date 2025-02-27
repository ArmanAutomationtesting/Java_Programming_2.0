package java_Arrar_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {6,5,4,8,3,2,1,7,12};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        boolean[] present = new boolean[max+1];
        for(int num : arr){
            present[num] = true;
        }
        for(int i=0; i<max; i++){
            if (!(present[i])) {

            list.add(i);
            }
        }
        System.out.println(list);

    }
}
