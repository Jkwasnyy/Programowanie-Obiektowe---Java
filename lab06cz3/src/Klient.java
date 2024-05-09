public class Klient {
    private String imie, nazwisko, miejscowosc;
    private int pesel;

    public Klient(String imie, String nazwisko, String miejsowosc, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejsowosc;
        this.pesel = pesel;
    }

    public void pokazDaneKlienta(){
        System.out.format("\n Imie: %s Nazwisko: %s", this.imie, this.nazwisko);
        System.out.format("\n Miejscowosc: %s", miejscowosc);
    }
}