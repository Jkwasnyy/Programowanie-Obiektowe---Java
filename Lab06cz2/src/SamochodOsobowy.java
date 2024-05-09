public class SamochodOsobowy extends Samochod {
    private double waga, pojemnoscSilnika;
    private int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        if(waga < 2 || waga > 4.5) throw new IllegalArgumentException("Waga musi byc w zakresie 2 - 4.5 T");
        if(pojemnoscSilnika < 0.8 || pojemnoscSilnika > 3.0) throw new IllegalArgumentException("Pojemnosc silnika musi byc w zakresie 0.8 - 3.0L");
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    public void pokazInformacje(){
        super.pokazInformacje();
        System.out.format(" Waga: %.2f T, pojemnoscSilnika: %.2f L, iloscOsob: %d", waga, pojemnoscSilnika, iloscOsob);
    }
}