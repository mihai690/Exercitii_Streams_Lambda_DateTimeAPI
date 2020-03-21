import java.util.*;

//avand o lista de siruri de caractere, afisam nr total al vocalelor
public class Ex10 {
    public static void main(String []args) {
        List<String> list = Arrays.asList("ABC", "SEDFR", "TGFR", "QWERTY", "EE");
        
        long nrVocale =
        list.stream()
            .map(s -> Arrays.asList(s.split("\\s*"))) //imparte sirul pe litere
            .flatMap(q -> q.stream()) //transforma din lista in stream de caractere pt a putea fol
            //mai departe caracterele de pe stream
            .filter(c -> "aeiou".contains(c.toLowerCase())) //filtrez vocalele
            .count();
            
        System.out.println(nrVocale);
    }
}