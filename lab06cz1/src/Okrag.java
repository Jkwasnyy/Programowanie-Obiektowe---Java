public class Okrag {
    private Punkt srodek;
    private double promien;

    public Okrag(){
        this.srodek = new Punkt(0,0);
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia(){
        return Math.PI * promien * promien;
    }
    public double getSrednica(){
        return promien * 2;
    }
    public void setPromien(double promien) {
        this.promien = promien;
    }
    public double getPromien(){
        return this.promien;
    }
    public boolean wSrodku(Punkt punkt){
        return Math.pow((punkt.x - srodek.x),2) + Math.pow((punkt.y - srodek.y), 2) <= Math.pow(this.promien,2);
    }
}