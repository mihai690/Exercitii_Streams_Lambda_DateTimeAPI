public class Ex2 {
    public static void main(String []args) {
        Predicat p1 = x -> true; //predicat care returneaza mereu true
        
        
        Predicat p2 = x -> x % 2 == 0;
        System.out.println(p2.test(10)); //true
        System.out.println(p2.test(11)); //false
        
        //nu se recomanda aceasta scriere
        Predicat p3 = x -> {
            System.out.println("Bau!");
            return x % 2 == 0;
    };
    
    //facem o metoda privata in aceeasi clasa (metoda myTest aici)
    Predicat p4 = x -> myTest(x);
            
    Predicat p5 = Ex2::myTest;
    //p4 si p5 sunt echivalente - p5 este simplificata
}

private static boolean myTest(int x) {
    System.out.println("Bau!");
    return x % 2 == 0;
}
}