package lt.bit.Savaite2;

public class MaziausiasSkaiciusMasyve {

    public static void main(String[] args) {
        int[] numbers = {88,33,55,23,64,123};
        int maziausiaReiksme = maziausiasSkaicius(numbers);
        System.out.println("Maziausia reiksme = " + maziausiaReiksme);
    }

    public static int maziausiasSkaicius(int[] skaiciai) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < skaiciai.length; i++) {
            if(min > skaiciai[i]) {
                min = skaiciai[i];
            }
        }
        return min;
    }
}
