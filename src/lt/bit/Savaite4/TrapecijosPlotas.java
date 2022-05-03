package lt.bit.Savaite4;

public class TrapecijosPlotas {
    public static void main(String[] args) {
        double a = 5;
        double b = 3;
        double h = 4;

        double plotas = (a+b) / 2 * h;

        System.out.println("Trapecijos plotas: " + String.format("%.0f",plotas));
    }
}
