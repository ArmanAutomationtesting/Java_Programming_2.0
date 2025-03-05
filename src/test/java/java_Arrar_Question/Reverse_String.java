package java_Arrar_Question;

public class Reverse_String {
    String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String Str[] = s.split(" ");
        String Str1 = "";
        for(int i = Str.length-1 ; i >= 0 ; i-- ){
           stringBuilder.append(Str[i]+" ");
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();

    }
    public static void main(String[] args){
        Reverse_String reverseString = new Reverse_String();
        reverseString.reverseWords("I love Iqra");
    }
}
