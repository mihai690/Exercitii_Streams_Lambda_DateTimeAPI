import java.util.*;

public class Ex17 {
    public static void main(String []args) {
        //preciam limba si/sau regiunea
        Locale l1 = new Locale("en");
        Locale l2 = new Locale("en", "US"); //en_US en_CA fr_CA
        Locale l3 = 
            new Locale.Builder()
            .setLanguage("en")
            .setRegion("US")
            .build();
            
        Locale l4 = Locale.GERMANY; //exista doar cateva constante
        //Romania nu se afla printre acestea
        
        System.out.println(l1); //en
        System.out.println(l2); //en_US
        System.out.println(l3); //en_US
        System.out.println(l4); //de_DE
        
    }
}