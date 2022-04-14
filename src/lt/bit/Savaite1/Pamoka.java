package lt.bit.Savaite1;


import java.util.Scanner;

public class Pamoka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiek pamoku yra pirmadieni?");
        int pamokuKiekisPirmadieni = sc.nextInt();
        System.out.println("Kiek pamoku yra antradieni?");
        int pamokuKiekisAntradieni = sc.nextInt();
        System.out.println("Kiek pamoku yra treciadieni?");
        int pamokuKiekisTreciadieni = sc.nextInt();
        System.out.println("Kiek pamoku yra ketvirtadieni?");
        int pamokuKiekisKetvirtadieni = sc.nextInt();
        System.out.println("Kiek pamoku yra penktadieni?");
        int pamokuKiekisPenktadieni = sc.nextInt();

        int visosPamokos = pamokuKiekisPirmadieni + pamokuKiekisAntradieni + pamokuKiekisTreciadieni
                + pamokuKiekisKetvirtadieni + pamokuKiekisPenktadieni;
        System.out.println("Pamoku skaicius: " + visosPamokos);

        int minutes = visosPamokos * 45;
        System.out.println("Tai sudaro minuciu: " + minutes);
    }
}
