package java_Arrar_Question;

import java.util.HashMap;

public class frequenciesofString {
    public static HashMap<Character, Integer> String_frequency(String str) {

        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char cha : ch) {
            if (!(cha == ' ' )) {
                hashMap.put(cha, hashMap.getOrDefault(cha, 0) + 1);

            }
        }
        return hashMap;
    }

        public static void main (String[]args){
            String str = "hello India";
            HashMap<Character, Integer> map2 = frequenciesofString.String_frequency(str);
            for (char ch1 : map2.keySet()) {
                System.out.println(ch1 + " = " + map2.get(ch1));
            }
        }
    }


