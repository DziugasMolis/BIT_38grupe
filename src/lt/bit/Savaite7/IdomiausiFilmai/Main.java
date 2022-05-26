package lt.bit.Savaite7.IdomiausiFilmai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        // Surikiuoti naudojant anonimine klase
        // Pagal pavadinima, jei lygu pagal metus, jei lygu pagal ziurovuSkaiciusMln
        Collections.sort(filmai, new Comparator<Filmas>() {
            @Override
            public int compare(final Filmas o1, final Filmas o2) {
                int res = o1.getPavadinimas().compareToIgnoreCase(o2.getPavadinimas());
                if(res != 0) {
                    return res;
                }
                res = o1.getMetai().compareTo(o2.getMetai());
                if(res != 0) {
                    return res;
                }
                return o1.getZiurovuSkaiciusMln().compareTo(o2.getZiurovuSkaiciusMln());
            }
        });
        System.out.println(filmai);
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
                Integer metai = Integer.parseInt(reiksmes[0]);
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
