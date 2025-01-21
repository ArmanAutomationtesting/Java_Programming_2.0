package java_Arrar_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascals_Triangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> List = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            Integer[] integer = new Integer[i + 1];
            Arrays.fill(integer,1);
            List.add(Arrays.asList(integer));
        }
        for(int i = 2; i < numRows; i++){
            for(int j = 1; j<List.get(i).size()-1.; j++){
                List.get(i).set(j,List.get(i-1).get(j-1)+List.get(i-1).get(j));
            }
        }


return List;

    }








    public static void main(String[] args) {
        int row_number = 5;
        System.out.println(generate(row_number));
    }
}
