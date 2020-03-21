import java.util.*;

//pentru o lista de siruri, afisam daca au lungime para
public class Ex7 {
    public static void main(String []args) {
        List<String> list = Arrays.asList("AAD", "QQQQ");
        
        boolean b1 = list.stream()
                .map(s -> s.length())
                .allMatch(n -> n % 2 == 0);
                
        boolean b2 = list.stream()
                .map(s -> s.length())
                .anyMatch(n -> n % 2 == 0);
                
        boolean b3 = list.stream()
                .map(s -> s.length())
                .noneMatch(n -> n % 2 == 0); 
                
        System.out.println(b1); //false
        System.out.println(b2); //true
        System.out.println(b3); //false
    }
}