package lt.bit.Savaite4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StaciakampisMain {
    // Susikurti klase Staciakampis su laukais id, x ir y.
    // Nuskaityti faila ir issaugoti juos Staciakampis[].
    // Rasti didziausia perimetra.
    // didziausia plota turincias figuras.

    public static void main(String[] args) {
        skaitom("src/lt/bit/Savaite4/staciakampiai.txt");
    }

    public static Staciakampis[] skaitom(String failoKelias) {
        Staciakampis[] laikinas = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(failoKelias));
            String eilute = br.readLine();
            System.out.println(eilute);
            eilute = br.readLine();
            System.out.println(eilute);
            eilute = br.readLine();
            System.out.println(eilute);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return laikinas;
    }
}
