package java_Arrar_Question;

import java.sql.Struct;

public class Pallindrom {
    public static Boolean isPallindrome(String p) {

         int right = p.length()-1;
         int left = 0;
         int count = 0;
         while(left <= right){
             if(p.charAt(left) == p.charAt(right)){
                 left++;
                 right--;
             }else
                 count++;
             break;
         }
         if (count > 0 ){
             return false;
         }
         return true;
    }

    public static  void main(String[] args){
        String str = "DALAD";
        Pallindrom pallindrom = new Pallindrom();
//        System.out.println("It is a pallindrom number" + " --" +  pallindrom.isPallindrome("DALAD"));
        if(isPallindrome(str)){
            System.out.println(str + " --> " + "It is a Pallindrome");
        }else
            System.out.println(str + " --> " + "It is not a Pallindrome");
    }
}

