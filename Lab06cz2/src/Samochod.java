public class Samochod {
    private String marka,model,nadwozie,kolor;
    private int rokProdukcji, przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void pokazInformacje(){
        System.out.format(" Marka: %s \n Model: %s \n Nadwozie: %s \n Kolor: %s \n rokProdukcji: %d \n Przebieg: %d KM \n", this.marka, this.model, this.nadwozie, this.kolor, this.rokProdukcji, this.przebieg);
    }
}