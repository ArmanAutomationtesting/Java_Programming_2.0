package java_Arrar_Question;

public class PrintMultiplenamenofor {

    public static void print(String name,int count){
        if(count <=0) return;
        System.out.println(name);
        print("Altamash",count-1);
    }

    public static void main(String[] args) {
        print("Altamash",5);
    }

}
