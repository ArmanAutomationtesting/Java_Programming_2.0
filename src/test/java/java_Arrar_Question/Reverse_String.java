package java_Arrar_Question;

public class Reverse_String {
    String reverseWords(String s) {
        String Str[] = s.split(" ");
        String Str1 = "";
        for(int i = Str.length-1 ; i >= 0 ; i-- ){
            Str1+=Str[i] + " ";
        }
        System.out.println(Str1);
        return Str1;

    }
    public static void main(String[] args){
        Reverse_String reverseString = new Reverse_String();
        reverseString.reverseWords("I love Iqra");
    }
}
