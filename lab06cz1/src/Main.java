
public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt();
        Punkt punkt3 = new Punkt();

        punkt1.zeruj();
        punkt1.opis();
        punkt1.przesun(2, 3);

        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat( 4, 10, "niebieski", new Punkt(0,0));
        Trojkat trojkat = new Trojkat(10, 6, "czerwony");

        System.out.println(figura.opis());
        System.out.format("Pole prostokata wynosi: %.2f", prostokat.getPowierzchnia());

        Okrag okrag = new Okrag(new Punkt(2,3), 5);
        boolean wSrodku = okrag.wSrodku(new Punkt(4,5));
        System.out.format("Punkt jest w srodku: %b", wSrodku);

        prostokat.przesun(3,5);
        Kwadrat kwadrat = new Kwadrat(10,10);

        System.out.println(figura.opis());
        System.out.println(prostokat.opis());
        System.out.println(trojkat.opis());
        System.out.println(kwadrat.opis());
    }
}