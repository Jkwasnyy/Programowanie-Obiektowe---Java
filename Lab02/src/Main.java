import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        zadanie1(a, b, c);
    }

    private static void zadanie1(double a, double b, double c) {
        double delta = b*b - 4*a*c;

        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2*a);
            double x2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println("x1: " + x1 + ", x2: " + x2);
        } else if (delta == 0) {
            double x = -b / (2*a);
            System.out.println("x: " + x);
        } else {
            System.out.println("Brak rzeczywistych rozwiązań");
        }
    }
}
