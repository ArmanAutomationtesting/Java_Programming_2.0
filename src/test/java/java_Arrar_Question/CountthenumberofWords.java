package java_Arrar_Question;

public class CountthenumberofWords {

    public static void main(String[] args) {
        String str = "ttreryy";
        for(int i=0; i<str.length()-2; i++){
            if(str.charAt(i) != str.charAt(i+1) && str.charAt(i+1) != str.charAt(i+2)){
                System.out.println(str.charAt(i+2));
                break;
            }

        }

    }
}
