public class Main {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("Skoda", "Octavia", "idealne", "srebrny", 2015, 200182);
        Samochod samochodOsobowy = new SamochodOsobowy("Opel", "Astra", "slabe", "czarny", 2003, 153211, 2.3, 1.8, 5);

        samochod.pokazInformacje();
        samochodOsobowy.pokazInformacje();
    }
}