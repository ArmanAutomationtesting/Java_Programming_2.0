package java_Arrar_Question;

public class Fibonaccio_Series {

    public static void main(String[] args) {
        int n =10;
        for(int i =0; i<=n; i++){
            System.out.print(FS(i) + " ");
        }
    }

    public static int FS(int n){
        if(n<= 1){
            return n;
        }
        return FS(n-1)+FS(n-2);
    }
}






