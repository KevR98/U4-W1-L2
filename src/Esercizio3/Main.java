package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parola;

        while (true) {
            System.out.print("Inserisci una parola: ");
            parola = scanner.nextLine();

            String[] virgola = parola.split("");
//            System.out.println(Arrays.toString(virgola));
            // Con questo codice stampa la parola in un array

            System.out.println(String.join(", ", virgola));

            if (parola.equals("q")) {
                System.out.println("Uscita dal programma...");
                break;
            }
            ;
        }

        scanner.close();
    }
}
