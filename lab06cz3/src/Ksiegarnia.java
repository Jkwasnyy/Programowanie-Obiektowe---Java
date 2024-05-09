import java.util.ArrayList;

public class Ksiegarnia {
    private String nazwa, miejscowosc;
    private ArrayList<Klient> klienci = new ArrayList<Klient>();
    private ArrayList<Powiesc> powiesci = new ArrayList<Powiesc>();
    private ArrayList<Podrecznik> podreczniki = new ArrayList<Podrecznik>();

    public Ksiegarnia(String nazwa, String miejscowosc) {
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
    }
    public void dodajPowiesc(Powiesc powiesc){
        powiesci.add(powiesc);
    }
    public void pokazPowiesci(){
        for(Powiesc powiesc : powiesci){
            System.out.format(" Tytul: %s \n Autor: %s %s \n Rok wydania: %d \n Motyw: %s \n Kategoria: %s \n Liczba rozdzialow: %d \n", powiesc.tytul, powiesc.autor.imie, powiesc.autor.nazwisko, powiesc.rokWydania, powiesc.motyw, powiesc.kategoria, powiesc.liczbaRozdzialow);
            System.out.format(" Bohaterowie: \n");
            for(String bohater : powiesc.bohaterowie){
                System.out.format(" %s", bohater);
            }
        }
    }
    public void dodajKlienta(Klient klient){
        klienci.add(klient);
    }
    public void dodajPodreczniki(Podrecznik podrecznik){
        podreczniki.add(podrecznik);
    }
}