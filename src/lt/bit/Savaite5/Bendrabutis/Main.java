package lt.bit.Savaite5.Bendrabutis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String failoKelias = "src/lt/bit/Savaite5/Bendrabutis/duomenys.txt";
        String rezultatuFailoKelias = "src/lt/bit/Savaite5/Bendrabutis/rezultatai.txt";
        BendrabuciuElektrosMenesineImoka duomenys = skaityti(failoKelias);
        spausdinti(rezultatuFailoKelias, duomenys);
        System.out.println(duomenys.getKwKaina());
        System.out.println(duomenys.getButuKw());
    }

    public static BendrabuciuElektrosMenesineImoka skaityti(String kelias) {
        BendrabuciuElektrosMenesineImoka ats = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(kelias));
            String eilute = br.readLine();
            int butuKiekis = Integer.parseInt(eilute);
            eilute = br.readLine();
            double kwKaina = Double.parseDouble(eilute);
            List<Double> butuKw = new ArrayList<>();
            for (int i = 0; i < butuKiekis; i++) {
                eilute = br.readLine();
                double sunaudotaKw = Double.parseDouble(eilute);
                butuKw.add(sunaudotaKw);
            }
            ats = new BendrabuciuElektrosMenesineImoka(kwKaina, butuKw);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ats;
    }

    public static void spausdinti(String kelias, BendrabuciuElektrosMenesineImoka duomenys) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(kelias));
            double visuSuma = 0d;
            for (int i = 0; i < duomenys.getButuKw().size(); i++) {
                double suma = duomenys.getKwKaina() * duomenys.getButuKw().get(i);
                visuSuma = visuSuma + suma;
                bw.write(i + 1 + ". " + String.format("%.2f", suma) + " Lt.\n");
            }
            double vienoButoMokamaSuma = visuSuma / duomenys.getButuKw().size();
            bw.write("Is viso sunaudota: uz " + String.format("%.2f", visuSuma) + " Lt.\n");
            bw.write("Vieno kambario gyventojai mokes: " + vienoButoMokamaSuma + " Lt.");

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
