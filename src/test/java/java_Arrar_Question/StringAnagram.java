package java_Arrar_Question;

import javax.xml.stream.events.Characters;
import java.util.Arrays;

public class StringAnagram {

    //two strings are Anagram if both have same length and characters in it
    // like int and nit
    // like car and arc
    public static void main(String[] args) {
        String str = "Care";
        String str1 = "care3";
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(isAnagram(str,str1)){
            System.out.println("It is a Anagram");
        }else{
            System.out.println("It is not a Anagram");
        }
    }

    public static boolean isAnagram(String str, String str1){
        if(str.length() != str1.length()){
            return false;
        }
        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch,ch1);
    }

}
