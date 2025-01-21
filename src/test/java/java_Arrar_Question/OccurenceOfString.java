package java_Arrar_Question;

import org.checkerframework.checker.units.qual.Length;

public class OccurenceOfString {

    public static String occurenseShibhi(String str1) {

        String a2 = "sad";
        String s1 = "";
        for(int i = 0,j=a2.length(); j<str1.length(); i++,j++)
        if(str1.substring(i,j).equals(a2)){
            s1 = str1.substring(i,j);
            return s1;
    }
        return s1;
}


    public static void main(String[] args) {
        String a1 = "gsgssadhello";
        String a2 = "sad";
        System.out.println(occurenseShibhi(a1));


    }
}
