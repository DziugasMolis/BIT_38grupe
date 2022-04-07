package lt.bit;

import java.util.Scanner;

public class Akvariumas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek zuvu gyvena akvariume?");
        int zuvuKiekisAkvariume = sc.nextInt();

        System.out.println("Kiek zuvu idedama kiekviena diena?");
        int kiekIdedama = sc.nextInt();

        System.out.println("Kiek dienu praejo?");
        int kiekDienuPraejo = sc.nextInt();

        int rezultatas = zuvuKiekisAkvariume + kiekIdedama * kiekDienuPraejo;
        System.out.println("Po " + kiekDienuPraejo + " dienu akvariume gyvens "
                + rezultatas + " zuvu.");
    }
}
