package Streams;

import dev.failsafe.internal.util.Maths;
import org.hamcrest.core.StringStartsWith;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<Integer>  list = Arrays.asList(3,4,3,5,2,34);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


        Object[] arr1 = list.stream().filter(i -> i%2 ==0 ).toArray();
        System.out.println(Arrays.toString(arr1));


                  int a = 10;
                  int b = 20;
                  int largenumber = a>b?a:b;
        System.out.println( );

    }
}
