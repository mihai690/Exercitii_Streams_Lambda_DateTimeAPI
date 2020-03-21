import java.util.Arrays;
import java.util.List;

public class Ex22 {
    //dandu-se o lista de String-uri, 
    //sa se afiseze cate dintre sirurile date au lungimea divizibila cu 3.

    static List<String> stringuri =
            Arrays.asList("abc", "aaaa", "bva",
                    "qweqweqwe", "bkw", "a",
                    "abbaba", "412");

    public static void main(String[] args) {
        long nr = stringuri.stream()
                .filter(string -> string.length() %3 == 0)
                .count();
        System.out.println(nr);
    }
}
