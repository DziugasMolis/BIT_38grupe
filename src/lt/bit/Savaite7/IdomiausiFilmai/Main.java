package lt.bit.Savaite7.IdomiausiFilmai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Nurodome duomenu failo kelia
        String duomenuFailoKelias = "src/lt/bit/Savaite7/IdomiausiFilmai/duomenys.txt";
        // Iskvieciame nuskaitymo metoda
        List<Filmas> filmai = skaityti(duomenuFailoKelias);
        // Surikiuoti filmus
        Collections.sort(filmai);
        System.out.println(filmai);
        // Atspausdinti i faila
    }

    public static List<Filmas> skaityti(String duomenuFailoKelias) {
        List<Filmas> filmai = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(duomenuFailoKelias))) {
            // Nusiskaitom kiek bus filmu
            String eilute = br.readLine();
            int n = Integer.parseInt(eilute);
            // for ciklas skaityti eilutem
            for(int i = 0; i < n; i++) {
                // nusiskaitom eilute readLine()
                eilute = br.readLine();
                // eilute.split(" ");
                String[] reiksmes = eilute.split(" ");
                // metai Integer.parseInt(reiksmes[0])
                int metai = Integer.parseInt(reiksmes[0]);
                // filmoPavadinimas substring(5, 29).trim()
                String filmoPavadinimas = eilute.substring(5, 29).trim();
                // valandos = reiksmes[reiksmes.length - 3]
                int valandos = Integer.parseInt(reiksmes[reiksmes.length - 3]);
                // minutes = reiksmes[reiksmes.length - 2]
                int minutes = Integer.parseInt(reiksmes[reiksmes.length - 2]);
                // pasiverciam i trukme LocalTime
                LocalTime trukme = LocalTime.of(valandos, minutes);
                // ziurovuSkaiciusMln = reiksmes[reiksmes.length - 1]
                Integer ziurovuSkaiciusMln = Integer.parseInt(reiksmes[reiksmes.length - 1]);
                // Susikurti filmas
                Filmas filmas = new Filmas(filmoPavadinimas, metai, trukme, ziurovuSkaiciusMln);
                // ideti i sarasa filma
                filmai.add(filmas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return filmai;
    }
}
