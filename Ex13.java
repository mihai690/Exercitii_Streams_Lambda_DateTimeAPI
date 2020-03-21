import java.time.*;

public class Ex13 {
    public static void main(String []args) {
        LocalDateTime lt1 = LocalDateTime.now();
        LocalDateTime lt2 = LocalDateTime.of(2017, 10, 20, 10, 30);
        LocalDateTime lt3 = LocalDateTime.of(2017, 10, 20, 10, 30, 50);
        
        LocalDate d1 = LocalDate.of(2017, 10, 20);
        LocalTime t1 = LocalTime.of(10, 50);
        LocalDateTime lt4 = LocalDateTime.of(d1, t1);
        
        // 2017-10-20T10:50
        
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);
    }
}