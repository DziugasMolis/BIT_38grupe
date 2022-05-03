package lt.bit.Savaite4;

public class Statybininkas {

    public static void main(String[] args) {
        // Plotis
        int a = 4;
        // Aukstis
        int h = 3;

        double plytosIlgis = 0.20;
        double plytosAukstis = 0.10;

        double k = 0.5;

        double sienosPlotas = a * h;
        double plytosPlotas = plytosIlgis * plytosAukstis;

        int plytuKiekis = (int) Math.ceil(sienosPlotas / plytosPlotas);
        System.out.println("Plytu kiekis: " + plytuKiekis);
        double plytuKaina = plytuKiekis * k;
        System.out.println("Plytos kainuos " + String.format("%.2f", plytuKaina) + " Lt");
    }
}
