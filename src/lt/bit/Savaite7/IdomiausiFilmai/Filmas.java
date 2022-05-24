package lt.bit.Savaite7.IdomiausiFilmai;

import java.time.LocalTime;

public class Filmas {
    private String pavadinimas;
    private int metai;
    private LocalTime trukme;
    private int ziurovuSkaiciusMln;
    
    public Filmas(String pavadinimas, int metai, LocalTime trukme, int ziurovuSkaiciusMln) {
        this.pavadinimas = pavadinimas;
        this.metai = metai;
        this.trukme = trukme;
        this.ziurovuSkaiciusMln = ziurovuSkaiciusMln;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public LocalTime getTrukme() {
        return trukme;
    }

    public void setTrukme(LocalTime trukme) {
        this.trukme = trukme;
    }

    public int getZiurovuSkaiciusMln() {
        return ziurovuSkaiciusMln;
    }

    public void setZiurovuSkaiciusMln(int ziurovuSkaiciusMln) {
        this.ziurovuSkaiciusMln = ziurovuSkaiciusMln;
    }

    @Override
    public String toString() {
        return "Filmas{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", metai=" + metai +
                ", trukme=" + trukme +
                ", ziurovuSkaiciusMln=" + ziurovuSkaiciusMln +
                '}';
    }
}
