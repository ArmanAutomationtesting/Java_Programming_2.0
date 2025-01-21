package java_Arrar_Question;

public class String_reverse_Special_char {

    public static String Spcl_character(String str){
        int left = 0;
        char temp;
        int right = str.length()-1;
        char[] ch = str.toCharArray();
        while(left<right){
            if(!Character.isLetterOrDigit(ch[left]) || Character.isSpaceChar(ch[left])){
                left++;
            } else if (!Character.isLetterOrDigit(ch[right]) || Character.isSpaceChar(ch[right])) {
                right--;
            }else{
                temp  = ch[left];
            ch[left]  = ch[right];
            ch[right] =  temp;
            left++;
            right--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "I LO@VE M#Y IN$DIA";
        System.out.println(Spcl_character(str));
    }
}
