import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class Ex21 {
    //dandu-se o lista de numere întregi, 
    //sa se afiseze cele mai mici 3 numere, ordonate crescător, distincte și impare.

    public static void main(String[] args) {
        
        List<Integer> numere = Arrays.asList(2, 5, 13, 5, 10, 3, 100, 5, 3);
        
        numere.stream()
            .filter(nr -> nr %2 != 0)
            .distinct()
            .sorted()
            .limit(3)
            .forEach(System.out::println);
        
    }
}
