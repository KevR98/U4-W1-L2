package Esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------- PARI O DISPARI ---------------------");

        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        System.out.println("La parola inserita è: " + pariDispari(parola));

        System.out.println("--------------------- ANNO BISESTILE ---------------------");
        System.out.print("Inserisci un anno per il controllo: ");
        int anno = Integer.parseInt(scanner.nextLine());
        annoBisestile(anno);

        System.out.println("Uscita dal programma...");
        scanner.close();

    }

    public static boolean pariDispari(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int annoBisestile(int n) {
        if (n % 4 == 0 && (n % 100 != 0)) {
            System.out.println("L'anno è bisestile");
        } else if (n % 400 == 0) {
            System.out.println("L'anno è bisestile");
        } else {
            System.out.println("L'anno non è bisestile");
        }
        return n;
    }
}
