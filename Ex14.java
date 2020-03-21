import java.time.*;

public class Ex14 {
    public static void main(String []args) {
        //pt a vedea toate ZoneId-urile
        ZoneId.getAvailableZoneIds()
            .stream()
            .filter(z -> z.contains("Europe")) //doar cele din Europa
            .forEach(System.out::println);
    }
}