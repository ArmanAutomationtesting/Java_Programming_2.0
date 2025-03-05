package java_Arrar_Question;

public class PrintMultiplenamenofor {

    public static void print(String name,int count){
        if(count <=0) return;
        System.out.println(name);
        count--;
        print("Altamash",count);
    }

    public static void main(String[] args) {
        print("Altamash",5);
    }

}
