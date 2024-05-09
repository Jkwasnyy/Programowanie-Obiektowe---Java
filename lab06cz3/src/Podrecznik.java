public class Podrecznik extends Ksiazka{
    private String przedmiotLekcyjny, szkola, klasa;

    public Podrecznik(String tytul, Autor autor, int rokWydania, String przedmiotLekcyjny, String szkola, String klasa) {
        super(tytul, autor, rokWydania);
        this.przedmiotLekcyjny = przedmiotLekcyjny;
        this.szkola = szkola;
        this.klasa = klasa;
    }
}