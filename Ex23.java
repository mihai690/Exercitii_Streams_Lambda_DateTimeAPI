import java.util.*;

//pentru o lista de nr intregi, afisam daca toate sunt impare
public class Ex23 {
    public static void main(String []args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        
        boolean b1 = list.stream()
                .allMatch(n -> n % 2 != 0);
                
                      
        System.out.println(b1); //false
       
    }
}