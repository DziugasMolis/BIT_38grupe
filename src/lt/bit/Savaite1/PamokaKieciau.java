package lt.bit.Savaite1;


import java.util.Scanner;

public class PamokaKieciau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiek pamoku yra pirmadieni?");
        int rezultatas = sc.nextInt();
        System.out.println("Kiek pamoku yra antradieni?");
        rezultatas = rezultatas + sc.nextInt();
//        rezultatas += sc.nextInt();
        System.out.println("Kiek pamoku yra treciadieni?");
        rezultatas = rezultatas + sc.nextInt();
        System.out.println("Kiek pamoku yra ketvirtadieni?");
        rezultatas = rezultatas + sc.nextInt();
        System.out.println("Kiek pamoku yra penktadieni?");
        rezultatas = rezultatas + sc.nextInt();

        System.out.println("Pamoku skaicius: " + rezultatas);

        int minutes = rezultatas * 45;
        System.out.println("Tai sudaro minuciu: " + minutes);
    }
}
