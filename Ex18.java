import java.util.*;

public class Ex18 {
    public static void main(String []args) {
        Locale loc = new Locale("it", "IT");
        
        ResourceBundle bundle = ResourceBundle.getBundle("exemplu", loc);
        
        String hello = bundle.getString("txtHello");
        
        System.out.println(hello);
        
    }
}
