package lt.bit.Savaite2;

public class ArSkaiciusLyginis {

    public static void main(String[] args) {
        int skaicius = 100;
        System.out.println(skaicius + " " + arLyginis(skaicius));
    }

    public static boolean arLyginis(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
