import java.util.stream.*;
import java.util.Random;

//program care genereaza 10 valori aleatoare in intervalul [1, 1000]
public class Ex5 {
    public static void main (String []args) {
        Random r = new Random();
        
        Stream.generate(() -> r.nextInt(1000) + 1)
            .limit(10)
            .forEach(System.out::println);
    }
}