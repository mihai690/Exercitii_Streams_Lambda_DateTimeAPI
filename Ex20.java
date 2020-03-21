import java.util.stream.Stream;
import java.util.Random;

public class Ex20 {

//sa se afiseze 10 numere random, in intervalul [0, 1000].
  public static void main(String[] args) {
        Random r = new Random();
      
        Stream.generate(()  -> r.nextInt(1000) + 1)
                .limit(10)
                .forEach(nr -> System.out.println(nr));
    }
}