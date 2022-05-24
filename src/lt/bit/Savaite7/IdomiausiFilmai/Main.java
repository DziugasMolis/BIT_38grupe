package lt.bit.Savaite7.IdomiausiFilmai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Nurodome duomenu failo kelia
        String duomenuFailoKelias = "src/lt/bit/Savaite7/IdomiausiFilmai/duomenys.txt";
        // Iskvieciame nuskaitymo metoda
        List<Filmas> filmai = skaityti(duomenuFailoKelias);
        // Surikiuoti filmus

        // Atspausdinti i faila
    }

    public static List<Filmas> skaityti(String duomenuFailoKelias) {
        List<Filmas> filmai = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(duomenuFailoKelias))) {

        } catch (IOException e) {
            e.printStackTrace();
        }

        return filmai;
    }
}
