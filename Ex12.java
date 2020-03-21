import java.time.*;

public class Ex12 {
    public static void main(String []args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2017, 10, 20);
        LocalDate d3 = LocalDate.of(2017, Month.OCTOBER, 20);
        
        //2017-10-20
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}