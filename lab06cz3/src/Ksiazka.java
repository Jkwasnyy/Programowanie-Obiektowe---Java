public class Ksiazka {
    protected Autor autor;
    protected String tytul;
    protected int rokWydania;

    public Ksiazka(String tytul, Autor autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public void pokazInformacje(){
        System.out.format(" Tytul: %s \n Autor: %s %s \n Rok wydania: %d \n", tytul, autor.imie, autor.nazwisko, rokWydania);
    }
}