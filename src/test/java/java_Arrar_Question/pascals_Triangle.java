package java_Arrar_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascals_Triangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> List = new ArrayList<>();
          //1,
        // 1,1
        // 1, 1, 1
        // 1, 1 , 1
        // 1, 1 , 1, 1

        List<List<Integer>> list = new ArrayList<>();

        for(int i =0; i<numRows; i++){
            Integer[] integer = new Integer[i+1];
            Arrays.fill(integer,1);
            list.add(Arrays.asList(integer));
        }

        for(int i =2; i<numRows; i++){
            for(int j =1; j<list.get(i).size()-1; j++){
                list.get(i).set(j,list.get(i).get(j-1)+list.get(i).get(j));
            }
        }

        return list;




    }








    public static void main(String[] args) {
        int row_number = 5;
        System.out.println(generate(row_number));
    }
}
