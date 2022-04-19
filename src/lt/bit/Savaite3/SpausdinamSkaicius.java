package lt.bit.Savaite3;

public class SpausdinamSkaicius {

    // Sukurti metoda spausdintiSkaiciusNuoIki(x, y)
    // spausdintiSkaiciusNuoIki(1, 100) -> 1,2,3,4,5...100
    // spausdintiSkaiciusNuoIki(-100, 100) -> -100,-99,-98...100
    public static void main(String[] args) {
        spausdintiSkaiciusNuoIki(1, 100);
    }


    public static void spausdintiSkaiciusNuoIki(int x, int y) {
        for(int i = x; i <= y; i++) {
            System.out.print(i + ",");
        }
    }
}
