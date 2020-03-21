@FunctionalInterface
//un consumator este un obiect care primeste o valoare si nu returneaza nimic
//folosim adnotarea @ pt ca pe viitor altcineva sa nu poata modifica interfata
public interface Consumator
{
    public void consuma(int x); //metoda abstracta
}
