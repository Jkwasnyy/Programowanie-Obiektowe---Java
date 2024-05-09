public class Kwadrat extends Prostokat {
    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public Kwadrat(double wys, double szer, String kolor, Punkt punkt) {
        super(wys, szer, kolor, punkt);
    }

    String opis(){
        return "Klasa Kwadrat. Kolor kwadratu: " + this.kolor;
    }

}