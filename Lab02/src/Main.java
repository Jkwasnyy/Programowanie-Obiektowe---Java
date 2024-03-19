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

        int x = 5;
        int y = 2;
        int z = 8;
        zadanie3(x, y, z);

        System.out.println("Czy pada deszcz? (true/false)");
        boolean padaDeszcz = scanner.nextBoolean();
        System.out.println("Czy jest autobus na przystanku? (true/false)");
        boolean jestAutobus = scanner.nextBoolean();
        zadanie4(padaDeszcz, jestAutobus);

        System.out.println("Wybierz operację: 1 - Dodawanie, 2 - Odejmowanie, 3 - Mnożenie, 4 - Dzielenie, 5 - Reszta z dzielenia");
        int wybor = scanner.nextInt();
        System.out.println("Podaj pierwszą liczbę:");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double liczba2 = scanner.nextDouble();
        zadanie6(wybor, liczba1, liczba2);
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
    public static void zadanie3(int x, int y, int z) {
        int min, mid, max;

        if (x < y && x < z) {
            min = x;
        } else if (y < z) {
            min = y;
        } else {
            min = z;
        }

        if (x > y && x > z) {
            max = x;
        } else if (y > z) {
            max = y;
        } else {
            max = z;
        }

        if ((x < y && x > z) || (x > y && x < z)) {
            mid = x;
        } else if ((y < x && y > z) || (y > x && y < z)) {
            mid = y;
        } else {
            mid = z;
        }

        System.out.println("Posortowane liczby: " + min + ", " + mid + ", " + max);
    }

    public static void zadanie4(boolean padaDeszcz, boolean jestAutobus) {
        if (padaDeszcz && jestAutobus) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if (padaDeszcz && !jestAutobus) {
            System.out.println("Nie dostaniesz się na uczelnię, bo nie ma autobusu");
        } else if (!padaDeszcz && jestAutobus) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Nie potrzebujesz parasolki");
        } else {
            System.out.println("Nie dostaniesz się na uczelnię i może być Ci potrzebny parasol");
        }
    }

    public static void zadanie6(int operacja, double liczba1, double liczba2) {
        switch (operacja) {
            case 1:
                System.out.println("Wynik dodawania: " + (liczba1 + liczba2));
                break;
            case 2:
                System.out.println("Wynik odejmowania: " + (liczba1 - liczba2));
                break;
            case 3:
                System.out.println("Wynik mnożenia: " + (liczba1 * liczba2));
                break;
            case 4:
                if (liczba2 != 0) {
                    System.out.println("Wynik dzielenia: " + (liczba1 / liczba2));
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            case 5:
                if (liczba2 != 0) {
                    System.out.println("Reszta z dzielenia: " + (liczba1 % liczba2));
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór operacji.");
                break;
        }
    }
}
