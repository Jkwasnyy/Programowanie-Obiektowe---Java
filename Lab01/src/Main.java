import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zadanie 1
        System.out.println(zadanie1("Jakub", 20));

        //Zadanie 2
        System.out.println("Podaj dwie liczby:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        zadanie2(a, b);

        //Zadanie 3
        System.out.println("Podaj liczbę do sprawdzenia parzystości:");
        int number = scanner.nextInt();
        System.out.println(zadanie3(number));

        //Zadanie 4
        System.out.println("Podaj liczbę do sprawdzenia podzielności przez 3 i 5:");
        int divisibleNumber = scanner.nextInt();
        System.out.println(zadanie4(divisibleNumber));

        //Zadanie 5
        System.out.println("Podaj liczbę do podniesienia do 3 potęgi:");
        int base = scanner.nextInt();
        System.out.println(zadanie5(base));

        //Zadanie 6
        System.out.println("Podaj liczbę do obliczenia pierwiastka kwadratowego:");
        double squareNumber = scanner.nextDouble();
        System.out.println(zadanie6(squareNumber));

        //Zadanie 7
        System.out.println("Podaj zakres losowania liczb (a, b):");
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        int bok1 = (int) (Math.random() * (high - low + 1)) + low;
        int bok2 = (int) (Math.random() * (high - low + 1)) + low;
        int bok3 = (int) (Math.random() * (high - low + 1)) + low;
        System.out.println("Wylosowane długości to: " + bok1 + ", " + bok2 + ", " + bok3);
        System.out.println(zadanie7(bok1, bok2, bok3));
    }

    //Zadanie 1
    public static String zadanie1(String name, int age) {
        return "Imię: " + name + ", Wiek: " + age;
    }

    //Zadanie 2
    public static void zadanie2(int a, int b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    //Zadanie 3
    public static boolean zadanie3(int number) {
        return number % 2 == 0;
    }

    //Zadanie 4
    public static boolean zadanie4(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    //Zadanie 5
    public static int zadanie5(int number) {
        return number * number * number;
    }

    //Zadanie 6
    public static double zadanie6(double number) {
        return Math.sqrt(number);
    }

    //Zadanie 7
    public static boolean zadanie7(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        if (max == a) {
            return b * b + c * c == a * a;
        } else if (max == b) {
            return a * a + c * c == b * b;
        } else {
            return a * a + b * b == c * c;
        }
    }
}
