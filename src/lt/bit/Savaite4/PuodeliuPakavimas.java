package lt.bit.Savaite4;

public class PuodeliuPakavimas {
    public static void main(String[] args) {
        int m = 7;
        int telpa = 3;

        int dezutes = m / telpa;
        System.out.println("Pilnu dezuciu skaicius: " + dezutes);

        int likePuodeliai = m % 3;
        System.out.println("Nesupakuotu puodeliu skaicius: " + likePuodeliai);
    }
}
