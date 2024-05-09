
public class Main {
    public static void main(String[] args) {
        Powiesc powiesc = new Powiesc("Nienasycony", new Autor("Paweł", "Wilkowicz", 45, 3), 2016, "biografia", "popularnonaukowy", new String[]{"Robert","Anna","Zbigniew"}, 341);
        Klient klient = new Klient("Jakub", "Kwaśniak", "Rzeszów", 666777888);
        Ksiegarnia ksiegarnia = new Ksiegarnia("Biblioteka Nad Kwadratem", "Rzeszów");

        ksiegarnia.dodajPowiesc(powiesc);
        ksiegarnia.dodajKlienta(klient);

        ksiegarnia.pokazPowiesci();
        klient.pokazDaneKlienta();
    }
}