package lt.bit.Savaite4;

import java.util.Arrays;

public class SkaiciuFiltravimas {

    // Isfiltruoti is masyvo skaiciai skaicius kurie didesni nei 5
    // ir grazinti juos naujame masyve
    public static void main(String[] args) {
        int[] skaiciai = {2, 99, 100, 8, 5, 9, -2, 0};

        int[] laikinas = new int[0];
        System.out.println(Arrays.toString(laikinas));
        laikinas = add(laikinas, 5);
        laikinas = add(laikinas, 99);
        System.out.println(Arrays.toString(laikinas));
    }

    public static int[] filtruotiDidesniusUz5(int[] x) {
        // Susikurti masyva kur desim atfiltruotas reiksmes
        int[] filtruoti = new int[0];
        // sukam cikla per visas masyvo reiksmes

        // Tikrinam su if ar skaicius didesnis uz 5

        // Idedame reiksme i savo susikurta masyva

        // Grazinam masyva
        return filtruoti;
    }

    public static int[] filtruotiDidesniusUz(int[] masyvas, int reiksme) {
        int[] filtruoti = new int[0];



        return filtruoti;
    }

    public static int[] add(int[] array, int value) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
        return array;
    }

}
