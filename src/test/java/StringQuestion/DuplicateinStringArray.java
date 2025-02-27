package StringQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateinStringArray {

    public static void main(String[] args) {
        String[] str = {"Arman","Arman","Iqra","Nasra","Tauheed","Altamas","Altamas","Hamza","Shifa"};
        List<String> NewList = new ArrayList<>();
        for(int i =0; i< str.length-1; i++){
            if(str[i].equals(str[i+1])){
                NewList.add(str[i]);
            }
        }
        System.out.println(NewList);
    }
}
