import java.util.*;

//pentru o lista de siruri, afisam cate au lungime para
public class Ex8 {
    public static void main(String []args) {
        List<String> list = Arrays.asList("AAA", "BB", "QQQ", "WWWW");
        
        long siruriPare =
        list.stream()
            .filter(s -> s.length() % 2 == 0)
            .count();
            
        System.out.println(siruriPare);
    }
}