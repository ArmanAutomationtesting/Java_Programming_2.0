package java_Arrar_Question;

import java.util.Arrays;

public class plusOne {

    //Input: digits = [1,2,3]
    //Output: [1,2,4]
    //Explanation: The array represents the integer 123.
    //Incrementing by one gives 123 + 1 = 124.
    //Thus, the result should be [1,2,4].

    public static int[] plus1(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] srr = {1,3,4};
        System.out.println(Arrays.toString(plus1(srr)));
    }
}
