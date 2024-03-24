package Runing;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);
    public int InputInt() {
        int liczbaInt = input.nextInt();
        return liczbaInt;
    }
    public double InputDouble() {
        double liczbaDouble = input.nextDouble();
        return liczbaDouble;
    }

    public String inputChar(){
        System.out.println("Podaj t lub T");
        String znak = input.next();
        return znak;
    }
}
