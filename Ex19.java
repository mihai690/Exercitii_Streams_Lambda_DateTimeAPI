import java.util.stream.Stream;

public class Ex19 {
    //sa se afiseze primele 15 numere intregi, impare.

    public static void main(String[] args) {
        
        Stream.iterate(1, nr -> nr + 2)
                .limit(15)
                .forEach(nr -> System.out.println(nr));
    }
}
