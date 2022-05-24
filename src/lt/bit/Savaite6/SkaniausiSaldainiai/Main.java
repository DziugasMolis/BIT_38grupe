package lt.bit.Savaite6.SkaniausiSaldainiai;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String failoKelias = "src/lt/bit/Savaite6/SkaniausiSaldainiai/duomenys.txt";
        String rezultatuKelias = "src/lt/bit/Savaite6/SkaniausiSaldainiai/rezultatai.txt";

        List<Gamintojas> gamintojai = skaityti(failoKelias);

        rikiuotiSaldainius(gamintojai);

        // Atspausdinti i konsole kad atrodytu kaip uzduoties rezultatai
        spausdintiGamintojus(gamintojai);

        // Atspausdinti i faila kad atrodytu kaip uzduoties rezultatai
        spausdintiGamintojus(rezultatuKelias, gamintojai);
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

    public static void spausdintiGamintojus(List<Gamintojas> gamintojai) {
        for (int i = 0; i < gamintojai.size(); i++) {
            Gamintojas gamintojas = gamintojai.get(i);
            System.out.println(gamintojas.getPavadinimas());

            for (int j = 0; j < gamintojas.getSaldainiai().size(); j++) {
                Saldainis saldainis = gamintojas.getSaldainiai().get(j);
                System.out.println(String.format("%-25s", saldainis.getPavadinimas()) + saldainis.getIvertinimas());
            }
        }
    }

    public static void spausdintiGamintojus(String failoKelias, List<Gamintojas> gamintojai) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(failoKelias));
            for (int i = 0; i < gamintojai.size(); i++) {
                Gamintojas gamintojas = gamintojai.get(i);
                bw.write(gamintojas.getPavadinimas());
                bw.newLine();
                for (int j = 0; j < gamintojas.getSaldainiai().size(); j++) {
                    Saldainis saldainis = gamintojas.getSaldainiai().get(j);
                    bw.write(String.format("%-25s", saldainis.getPavadinimas()) + saldainis.getIvertinimas());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
