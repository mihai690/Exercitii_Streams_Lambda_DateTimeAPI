public class Ex1 {
    
    public static void main (String []args) {
        Consumator c1 = new MyConsumer();
        c1.consuma(10); //se apeleaza metoda instantei
        
        //o alta modalitate este aceea a folosirii tipurilor anonime
        Consumator c2 = new Consumator() {
            @Override
            public void consuma(int x) {
                System.out.println(x);
            }
        };
        c2.consuma(30);
        
        Consumator c3 = x -> System.out.println(x);
        c3.consuma(40);
        
        Consumator c4 = (x) -> System.out.println(x);
        c4.consuma(50);
        
        Consumator c5 = (int x) -> System.out.println(x);
        c5.consuma(60);
        
        Consumator c6 = System.out::println;
        c6.consuma(70);        
        
    }
    //cea mai comuna modalitate de a avea o instanta a unei interfete este aceea
    //de a avea o clasa ce implementeaza interfata
    private static class MyConsumer implements Consumator {
        @Override
        public void consuma(int x) {
            System.out.println(x);
        }
    }
}