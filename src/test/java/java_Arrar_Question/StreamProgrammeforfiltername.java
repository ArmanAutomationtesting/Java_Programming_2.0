package java_Arrar_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgrammeforfiltername {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Arman","Hello","Arun","Geeta");
        List<String> filteredname = list.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredname);

    }
}
