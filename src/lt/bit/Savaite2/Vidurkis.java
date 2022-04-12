package lt.bit.Savaite2;

public class Vidurkis {

    public static void main(String[] args) {
        int[] masyvas = new int[]{2, 3, 999, 6};
        double vid = masyvoElementuVidurkis(masyvas);
        System.out.println(vid);
    }

    public static double masyvoElementuSuma(int[] x) {
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma = suma + x[i];
        }
        return suma;
    }

    public static double masyvoElementuVidurkis(int[] x) {
        double suma = masyvoElementuSuma(x);
        return suma / x.length;
    }
}
