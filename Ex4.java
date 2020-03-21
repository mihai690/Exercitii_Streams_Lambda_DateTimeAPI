import java.util.stream.*;

public class Ex4 {
    public static void main (String []args) {
        Stream<Integer> s1 = Stream.empty();
        //creare Stream gol - fol pt tratarea unei exceptii, pt a nu returna null.
        
        Stream<Integer> s2 = Stream.of(3,5,6,7,8,9);
        //creare Stream cu nr finit de valori
        //of() are ca parametru un varargs - pot da cati parametri doresc
        
        Stream<Integer> s3 = Stream.iterate(1, i-> i + 2); //1, 3, 5, 7, ....
        //creare Stream cu nr infinit de valori
        //primul parametru = valoarea de la care se incepe
        //al 2lea parametru = expr lambda ce da regula de generare a urm. valori
        
        Stream<Integer> s4 = Stream.generate(() -> 1); //infinitate de valori de 1
        //genereaza tot un nr infinit de valori cu aj unui Supplier care ii spune
        //ce sa genereze
        
        s3.limit(10) //limitam nr de valori generate la 10
            .forEach(System.out::println);//1,3,5,7,..,19
            
        s4.limit(10)
            .forEach(System.out::println);
        
    }
}
    
