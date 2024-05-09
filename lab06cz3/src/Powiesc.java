public class Powiesc extends Ksiazka{
    protected String motyw, kategoria;
    protected String[] bohaterowie;
    protected int liczbaRozdzialow;

    public Powiesc(String tytul, Autor autor, int rokWydania, String motyw, String kategoria, String[] bohaterowie, int liczbaRozdzialow) {
        super(tytul, autor, rokWydania);
        this.motyw = motyw;
        this.kategoria = kategoria;
        this.bohaterowie = bohaterowie;
        this.liczbaRozdzialow = liczbaRozdzialow;
    }

    public void pokazInformacje(){
        super.pokazInformacje();
        System.out.format(" Motyw: %s \n Kategoria: %s \n Liczba rozdzialow: %d \n", motyw, kategoria, liczbaRozdzialow);
        System.out.println(" Lista bohaterow: ");
        for (String bohater : bohaterowie){
            System.out.format(" %s ", bohater);
        }
    }
}