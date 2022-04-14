package lt.bit.Savaite2;

// Sukurti metoda apskaiciuotiPerimetra(x, y)
// Sukurti metoda apskaiciuotiPlota(x, y)
// Iskviesti is main ir atspausdinti rezultata kai krastine x = 4, o krastine y = 3.6
public class Staciakampis {
    public static void main(String[] args) {
        double pirmaKrastine = 10;
        double antraKrastine = 3.6;
        double perimetas = apskaiciuotiPerimetra(pirmaKrastine, antraKrastine);
        System.out.println("Perimetas = " + perimetas);
        double plotas = apskaiciuotiPlota(pirmaKrastine, antraKrastine);
        System.out.println("Plotas = " + plotas);
    }

    public static double apskaiciuotiPerimetra(double x, double y) {
        return x * 2 + y * 2;
    }

    public static double apskaiciuotiPlota(double x, double y) {
        return x * y;
    }
}
