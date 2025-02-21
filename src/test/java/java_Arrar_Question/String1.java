package java_Arrar_Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {


        // "i love programing" to "I Love Programing"

//        String str = "i love programing";
//        String[] str1 = str.split(" ");
//        System.out.println(Arrays.asList(str1));
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for(String word : str1){
//           String cap = (word.substring(0,1).toUpperCase()
//           + word.substring(1).toLowerCase());
//           stringBuilder.append(cap).append(" ");
//        }
//
//        System.out.println(stringBuilder.toString().trim());


        // Third largest number

//        int[] arr = {1, 5, 6, 8, 4, 5, 7};
//        int l = arr[0];
//        int Sec = 0;
//        int third = 0;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (arr[i] > l){
//                int temp = l;
//                l = arr[i];
//                third = Sec;
//                Sec = temp;
//            }
//        }
//        System.out.println("Largest number in this " + "---> " + Arrays.toString(arr) + "---->" + l);
//        System.out.println(Sec);
//        System.out.println(third);


        // Find occurrence of the letter in the String using map
//        String str = "I love I My India";
//        Map<String,Integer> result = mapOccurrence(str);
//        for(String ch3 : result.keySet()){
//            if(ch3 != " "){
//            System.out.println(ch3 + "-->" + result.get(ch3) );
//            }
//        }
//    }

//    public static Map<String,Integer> mapOccurrence(String str) {
//
//        Map<String, Integer> map = new HashMap<>();
//        String[] str1 = str.split(" ");
//        for(String ch : str1 ){
//            map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//
//        return map;
//    }

        int[] arr = {3,4,5,7,8,5,7};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
