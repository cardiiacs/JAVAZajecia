package zajecia;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        new Czlowiek(100, 0, 0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zycie i Walka");
        System.out.println("1. Wyjscie");
        System.out.println("2. Walka");
        System.out.println("3. Wyswietl statystyki");
        System.out.println("4. Leczenie");
        System.out.println();
        Czlowiek.stat();

        int w = scanner.nextInt();

        while (w == 1) {
            break;
        }

        while (w == 2) {
            Czlowiek.walka();
        }

        while (w == 3) {
            Czlowiek.stat();break;
        }

        while (w == 4) {
            Czlowiek.leczenie();
        }
    }
}
