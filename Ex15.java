import java.time.*;

public class Ex15 {
    public static void main(String []args) {
        //afim ora curenta pt fusul orar pe care ne aflam + ora pt fusul coresp Londrei
        ZonedDateTime zd1 = ZonedDateTime.now();
        ZonedDateTime zd2 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        
        System.out.println(zd1);
        System.out.println(zd2);
        
        
    }
}