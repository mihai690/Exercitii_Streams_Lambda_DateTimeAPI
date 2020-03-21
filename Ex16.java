import java.time.*;

public class Ex16 {
    public static void main(String []args) {
        //daca dorim sa reprezentam perioada de timp
        Duration d = Duration.ofMinutes(10);
        Period p = Period.ofYears(5);
        
        System.out.println(d);
        System.out.println(p);
        
    }
}