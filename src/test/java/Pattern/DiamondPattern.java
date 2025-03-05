package Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int row = 5 ;
        for (int i =1; i<=row; i++){
            for(int j=1; j<=row-i; j++ ){
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int rows = 4;
        for (int i = 1; i <= rows; i++){
            for (int j =1; j<=i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <=(rows-i)+1; k++){
                System.out.print("* ");
            }
            for (int j =1; j <= rows-i; j++ ){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
