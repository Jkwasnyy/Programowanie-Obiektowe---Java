package Figures;

public class Cuboid {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private double pole(double a, double b, double c){
        return 2*(a*b)+2*(a*c)+2*(b*c);
    }
    private double obwod(double a, double b, double c){
        return ;
    }
    private double objetosc(double a, double b, double c){

    }
    public void view(){
        System.out.format("Figura: %s, pole: %.2f, obwod: %.2f",name,pole(a,b,c),obwod(a,b,c),objetosc(a,b,c));
    }
}
