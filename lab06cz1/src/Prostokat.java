class Prostokat extends Figura {
    double wys=0, szer=0;

    Prostokat(double wys, double szer){
        this.wys = wys;
        this.szer = szer;
    }
    Prostokat(double wys,double szer, String kolor, Punkt punkt){
        super(kolor, punkt);
        new Prostokat(wys, szer);
    }
    double getPowierzchnia() {
        return (szer * wys);
    }
    public void przesun(float x, float y){
        System.out.format("Wspolrzedne prostokata przed przesunieciem x:%d, y:%d \n", this.punkt.x, this.punkt.y);
        this.punkt.x += x;
        this.punkt.y += y;
        System.out.format("Wspolrzedne prostokata po przesunieciu x:%d, y:%d \n", this.punkt.x, this.punkt.y);
    }
    String opis(){
        return "Klasa Prostokat. Kolor prostokatu: " + this.kolor;
    }
}