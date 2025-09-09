package Esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una numero tra 0 e 3 per visualizzare la lettera: ");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            default:
                System.out.println("Errore");
        }

        System.out.println("Uscita dal programma...");
        scanner.close();
    }
}
