package java_Arrar_Question;

import java.util.Arrays;

public class KthHIghest {

    public static void main(String[] args) {
        int[] arr = {3,4,32,2,6,7};
        int K = 2;
        Arrays.sort(arr);
        System.out.println(arr[arr.length-K]);

    }
}
