/**
 * 
 * IntStream
 * LongStream
 * DoubleStream
 * 
 * x --> map() --> 2*x 
 * s --> map() --> s.length()
 * (Stream) s --> map() --> (IntStream) s.length()
 * 
 * map(), mapToInt(), mapToDouble(), mapToLong(), mapToObj()
 * 
 * Stream -->       map() -->           Stream
 * Stream -->       mapToInt() -->      IntStream
 * Stream -->       mapToDouble() -->   DoubleStream
 * Stream -->       mapToLong() -->     LongStream
 * 
 * IntStream -->    mapToLong() -->     LongStream
 * IntStream -->    mapToDouble() -->   DoubleStream
 * IntStream -->    map() -->           IntStream
 * IntStream -->    mapToObj() -->      Stream
 * 
 * LongStream -->   mapToInt() -->      IntStream
 * LongStream -->   mapToDouble() -->   DoubleStream
 * LongStream -->   map() -->           LongStream
 * LongStream -->   mapToObj() -->      Stream
 * 
 * DoubleStream --> mapToInt() -->      IntStream
 * DoubleStream --> map() -->           DoubleStream
 * DoubleStream --> mapToLong() -->     LongStream
 * DoubleStream --> mapToObj() -->      Stream
 */

import java.util.*;
//avand o lista de siruri de caractere, facem media aritmetica a lungimilor sirurilor
public class Ex6 {
    public static void main(String []args) {
        List<String> list = Arrays.asList("AAA", "BBBB", "CC", "DDDD");
        
        double av =
        list.stream()
            .mapToInt (s -> s.length())
            .average().getAsDouble();
            
        System.out.println(av);
    }
}