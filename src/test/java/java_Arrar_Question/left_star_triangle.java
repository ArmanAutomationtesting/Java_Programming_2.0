package java_Arrar_Question;

public class left_star_triangle {
    public static void main(String[] args) {
        int number_of_rows = 3;
        for(int i = 1; i <= number_of_rows; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int number0fRows = 6;
        for(int i = number0fRows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int row = 3;
        for ( int i = 1; i <= row ; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1 ; i <= row; i++){
            for(int j = 1; j < i ; j++){
                System.out.print(" ");
            }
            for (int j = i ; j <= row; j++){
                System.out.print("*");
            }
            System.out.println();
        }


//         *****
//          ***
//           *

        for (int i = 0; i < row; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (2 * (row - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
