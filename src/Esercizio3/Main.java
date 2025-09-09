package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parola;

        while (true) {
            System.out.print("Inserisci una parola: ");
            parola = scanner.nextLine();
            System.out.println(parola);
            if (parola.equals("q")) break;
        }

    }
}
