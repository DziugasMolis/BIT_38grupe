package lt.bit.Savaite6.SkaniausiSaldainiai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String failoKelias = "src/lt/bit/Savaite6/SkaniausiSaldainiai/duomenys.txt";

        List<Gamintojas> gamintojai = skaityti(failoKelias);

        System.out.println("Pries rikiavima");
        System.out.println(gamintojai);

        rikiuotiSaldainius(gamintojai);

        System.out.println("Po rikiavimo");
        System.out.println(gamintojai);

        // Atspausdinti i konsole kad atrodytu kaip uzduoties rezultatai

        // Atspausdinti i faila kad atrodytu kaip uzduoties rezultatai

    }

    public static List<Gamintojas> skaityti(String failoKelias) {
        List<Gamintojas> gamintojai = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(failoKelias));
            String eilute = br.readLine();
            int gamintojuKiekis = Integer.parseInt(eilute);

            for (int i = 0; i < gamintojuKiekis; i++) {
                eilute = br.readLine();
                String gamintojoPavadinimas = eilute.substring(0, 24).trim();
                int saldainiuKiekis = Integer.parseInt(eilute.substring(25));
                List<Saldainis> saldainiai = new ArrayList<>();
                Gamintojas gamintojas = new Gamintojas(gamintojoPavadinimas, saldainiai);
                for (int j = 0; j < saldainiuKiekis; j++) {
                    eilute = br.readLine();
                    String saldainioPavadinimas = eilute.substring(0, 19).trim();
                    int ivertinimas = Integer.parseInt(eilute.substring(20));
                    Saldainis saldainis = new Saldainis(saldainioPavadinimas, ivertinimas);
                    saldainiai.add(saldainis);
                }
                gamintojai.add(gamintojas);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return gamintojai;
    }

    public static void rikiuotiSaldainius(List<Gamintojas> gamintojai) {
        for (int i = 0; i < gamintojai.size(); i++) {
            Collections.sort(gamintojai.get(i).getSaldainiai());
        }
    }

}
