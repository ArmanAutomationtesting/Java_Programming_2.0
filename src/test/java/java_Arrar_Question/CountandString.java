package java_Arrar_Question;

import org.openqa.selenium.devtools.v123.domsnapshot.model.StringIndex;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountandString {
    // input = "aaabbbbcca";
    public static Map<Character,Integer> countandPrint(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char ch1 : ch){
            map.put(ch1,map.getOrDefault(ch1,0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        StringBuilder Index = new StringBuilder();
        String input = "aaabbbbcca";
        Map<Character,Integer> result = countandPrint(input);
        for(char result1 : result.keySet()){
            Index.append(result.get(result1)).append(String.valueOf(result1));
        }
        System.out.println(Index);

//       input.chars()
//               .mapToObj(c -> (char) c)
//               .collect((Collectors.groupingBy(c -> c, Collectors.counting())))
//               .forEach((character,count) -> Index.append(count).append(character) );
//
//        System.out.println(Index);



    }

}
