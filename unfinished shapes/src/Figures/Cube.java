package Figures;

public class Cube {
    private double a;
    private String name;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private double pole(double a){
        return 6*Math.pow(a,2);
    }
    private double obwod(double a){
        return 12*a;
    }
    private double objetosc(double a){
        return Math.pow(a,3);
    }
    public void view(){
        System.out.format("Figura: %s, pole: %.2f, obwod: %.2f",name,pole(a),obwod(a),objetosc(a));
    }
}
