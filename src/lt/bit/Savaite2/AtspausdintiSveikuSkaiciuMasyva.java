package lt.bit.Savaite2;

public class AtspausdintiSveikuSkaiciuMasyva {
    public static void main(String[] args) {
        int[] sveikiejiSkaiciai = new int[10];
        sveikiejiSkaiciai[0] = 1;
        sveikiejiSkaiciai[4] = 99;
        sveikiejiSkaiciai[sveikiejiSkaiciai.length - 1] = 100;

        spausdintiSveikuosiusSkaicius(sveikiejiSkaiciai);
    }

    public static void spausdintiSveikuosiusSkaicius(int[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
