package java_Arrar_Question;

public class MaxAndMinVal {

    public static void main(String[] args) {
        int[] arr = {2,4,2,5,7,5,4,6,1};
        int max = arr[0];
        int min = arr[0];
        for(int i =0; i< arr.length; i++){
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
