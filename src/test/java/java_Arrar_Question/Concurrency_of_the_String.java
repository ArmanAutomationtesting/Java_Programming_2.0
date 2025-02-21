package java_Arrar_Question;

public class Concurrency_of_the_String {

    public static  String strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
           if(haystack.substring(i,j).equals(needle)){
               return haystack.substring(i,j);
           }
        }
        return haystack;
    }


    public static void main(String[] args) {
        String hello = "hellosad";
        String hello1 = "sad";

        System.out.println(strStr(hello,hello1));
    }
}
