package lt.bit.Savaite3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Skaitom {
    public static void main(String[] args) {
        // Nusiskaitom duomenis ir issaugom juos
        int[] skaiciai = skaitom("src/lt/bit/Savaite3/skaiciai.txt");
        System.out.println(Arrays.toString(skaiciai));
        // Suma

        // Vidurkis

        // Min

        // Max

    }

    public static int[] skaitom(String failoKelias) {
        int[] masyvas = null;

        try  {
            BufferedReader br = new BufferedReader(new FileReader(failoKelias));
            String eilute = br.readLine();
            int masyvoIlgis = Integer.parseInt(eilute);
            masyvas = new int[masyvoIlgis];
            String eilute2 = br.readLine();
            String[] reiksmes = eilute2.split(",");
            for(int i = 0; i < masyvoIlgis; i++) {
                masyvas[i] = Integer.parseInt(reiksmes[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return masyvas;
    }

}
