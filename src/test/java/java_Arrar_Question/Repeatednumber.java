package java_Arrar_Question;

import java.util.*;

public class Repeatednumber {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,6,7,7,8,9,9};
        List<Integer> list1 = new ArrayList<>();
//        for(Integer num : arr){
//            list1.add(num);
//        }
        List<Integer> list2 = new ArrayList<>();
        for(int num : arr){
            if(!(list2.contains(num))){
                list2.add(num);
            }else{
                list1.add(num);
            }
        }
        System.out.println(list1);

    }

}
