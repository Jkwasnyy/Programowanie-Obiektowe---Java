package Figures;

public class Cicrle {
    private double r;
    private String name;
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private double pole(double r){
        return Math.PI*Math.pow(r,2);
    }
    private double obwod(double r){
        return 2*Math.PI*r;
    }
    public void view(){
        System.out.format("Figura: %s, pormien: %.2f, pole: %.2f, obwod: %.2f",name,r,pole(r),obwod(r));
    }
}
