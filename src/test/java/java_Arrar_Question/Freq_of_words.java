package java_Arrar_Question;

import java.util.HashMap;

public class Freq_of_words {
 public static HashMap<String,Integer> words_frequency (String str) {
     HashMap<String,Integer> map = new HashMap<>();
     String[] words = str.split("\\s");
     for(String word : words) {
         if (!(word.contains(" "))) {
             map.put(word, map.getOrDefault(word, 0) + 1);
         }
     }
     return map;
 }




 public static void main(String[] args){
     String input = "I Love My Country and I love my India";
     HashMap<String,Integer> map2 = Freq_of_words.words_frequency(input);
      for(String word : map2.keySet()){
          System.out.println(word + " --> " + map2.get(word));
      }

 }
}
