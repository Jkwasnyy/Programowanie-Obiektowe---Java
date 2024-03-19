import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę studentów w grupie:");
        int liczbaStudentow = scanner.nextInt();
        double srednia = zadanie1(liczbaStudentow);
        System.out.printf("Średnia liczba punktów w grupie: %.2f\n", srednia);

        int[] wyniki = zadanie2(10);
        System.out.println("Liczba dodatnich: " + wyniki[0] + ", Suma dodatnich: " + wyniki[1]);
        System.out.println("Liczba ujemnych: " + wyniki[2] + ", Suma ujemnych: " + wyniki[3]);
    }

    public static double zadanie1(int liczbaStudentow) {
        Scanner scanner = new Scanner(System.in);
        int sumaPunktow = 0;

        int liczbaWprowadzonychStudentow = 0;
        while (liczbaWprowadzonychStudentow < liczbaStudentow) {
            System.out.println("Podaj liczbę punktów dla studenta nr " + (liczbaWprowadzonychStudentow + 1) + ":");
            int punkty = scanner.nextInt();
            sumaPunktow += punkty;
            liczbaWprowadzonychStudentow++;
        }

        return (double) sumaPunktow / liczbaStudentow;
    }

    public static int[] zadanie2(int iloscLiczb) {
        Scanner scanner = new Scanner(System.in);

        int liczbaDodatnich = 0;
        int sumaDodatnich = 0;
        int liczbaUjemnych = 0;
        int sumaUjemnych = 0;

        System.out.println("Podaj " + iloscLiczb + " liczb:");

        for (int i = 0; i < iloscLiczb; i++) {
            System.out.print((i + 1) + ": ");
            int liczba = scanner.nextInt();

            if (liczba > 0) {
                liczbaDodatnich++;
                sumaDodatnich += liczba;
            } else if (liczba < 0) {
                liczbaUjemnych++;
                sumaUjemnych += liczba;
            }
        }

        return new int[] {liczbaDodatnich, sumaDodatnich, liczbaUjemnych, sumaUjemnych};
    }
}
