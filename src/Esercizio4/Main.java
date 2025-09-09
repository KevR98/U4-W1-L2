package Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Conto alla rovescia dal numero " + n + " a 0:");

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
