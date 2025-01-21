package java_Arrar_Question;

public class frequencyOfLastWord {
    public static int freqOfWord(String str){
        str = str.trim();
        int n = str.length();
        int length = 0;
        for( int i = n-1;i>=0;i--){
      if (str.charAt(i) != ' ') {
                length++;
            }
      if (str.charAt(i) == ' '){
          break;
      }
        }
        return length;

    }


    public static void main(String[] args) {
        String arman = "Arman Ahmad             ";
        System.out.println(freqOfWord(arman));
    }
}
