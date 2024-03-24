package Figures;

public class Rectangle {
    private double a;
    private double b;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double pole(double a, double b){
        return a*b;
    }
    private double obwod(double a, double b){
        return (2*a)+(2*b);
    }
    public void view(){
        System.out.format("Figura: %s, pole: %.2f, obwod: %.2f",name,pole(a,b),obwod(a,b));
    }
}
