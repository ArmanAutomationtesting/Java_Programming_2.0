package java_Arrar_Question;

public class FindMAXdiffinAnArray {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,9,43};
        int max = 0;
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                int a = arr[i]-arr[j];
                if( a > max){
                    max = a;
                }
            }
        }
        System.out.println(max);
    }
}
