import java.util.*;

//avand o lista de numere intregi care poate contine duplicate, 
//afisam suma numerelor distincte
public class Ex9 {
    public static void main(String []args) {
        List<Integer> list = Arrays.asList(2, 4, 2, 1, 6);
        
        int sum =
        list.stream()
            .distinct()
            .mapToInt(x -> x)
            .sum();
            
        System.out.println(sum); //13
    }
}