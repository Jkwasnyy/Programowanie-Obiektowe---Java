package Runing;

public class Run {
    Input input = new Input();
    public void runing() {
        int wybor;
        while(true){
            Menu();
            wybor = input.InputInt();
            switch(wybor){
                case 1 -> viewCircle();
                case 2 -> viewSquare();
                case 3 -> viewRectangle();
                case 4 -> viewCuboid();
                case 0 -> close();
                default -> defaultInstuction();
            }
        }
    }
    private void defaultInstuction(){

    }
    private void close(){
        System.out.println("Czy na pewno chcesz wyjsc? t || T");
        String znak = input.inputChar();
        String str1 = "t", str2 = "T";
        if(znak.equals(str1) || znak.equals(str2)) System.exit(0);
    }
    private void viewCircle(){
        System.out.println("Kolo :)");
    }
    private void viewSquare(){
        System.out.println("Kwadrat :o");
    }
    private void viewRectangle(){
        System.out.println("Prostokat :>");
    }
    private void viewCuboid(){
        System.out.println("Prostopadloscioan :<");
    }
    private void Menu(){
        System.out.println("Kalkulator figur geometrycznych");
        System.out.println("1. Kolo\n"+"2. Kwadrat\n"+"inne\n"+"0. Wyjscie");
        System.out.println("\n\nWybierz opcje: ");
    }
}
