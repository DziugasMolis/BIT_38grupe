package lt.bit.Savaite2;

import java.util.Arrays;

public class SkaiciaiMazesniUz10 {

    // 5, 22, 13, 7, 10
    // 5, 7
    public static void main(String[] args) {
        int[] skaiciai = {5, 22, 13, 7, 10};

        int[] filtruotosReiksmes = filtruotiMazesniusUz10(skaiciai);

        for (int x : filtruotosReiksmes) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(filtruotosReiksmes));
    }

    public static int[] filtruotiMazesniusUz10(int[] masyvas) {
        // Susikurti nauja masyvas kurio ilgis bus paduoto masyvo ilgis (masyvas.length)
        int[] filtruoti = new int[masyvas.length];
        // Sukam cikla
        for(int i = 0; i < masyvas.length; i++) {
            // Tikrinam ar skaicius mazesnis uz 10
            if (masyvas[i] < 10) {
                // Idedam reiksme i masyva
                filtruoti[i] = masyvas[i];
            }

        }
        // Grazinam nauja masyvva
        return filtruoti;
    }
}
