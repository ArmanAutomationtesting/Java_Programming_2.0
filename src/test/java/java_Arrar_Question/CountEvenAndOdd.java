package java_Arrar_Question;

public class CountEvenAndOdd {

    public static void main(String[] args) {
        int[] arr = {5,6,4,3,7,12,9};
        int Oddcount =0;
        int evenCount = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenCount++;
            } else {
                Oddcount++;
            }
        }

        System.out.println(Oddcount);
        System.out.println(evenCount);
    }
}
