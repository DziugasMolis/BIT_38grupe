package lt.bit;

import java.util.Scanner;

public class Taupykle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiek yra monetu po 5ct?");
        int penkiuCtMonetos = sc.nextInt();
        System.out.println("Kiek yra monetu po 20ct?");
        int dvidesimtCtMonetos = sc.nextInt();
        System.out.println("Kiek yra monetu po 2Lt?");
        int dviejuLtMonetos = sc.nextInt();

        double rez = 0.05 * penkiuCtMonetos + dvidesimtCtMonetos * 0.2 + dviejuLtMonetos * 2;
        System.out.println("Taupykleje yra " + rez + "Lt");
    }
}
