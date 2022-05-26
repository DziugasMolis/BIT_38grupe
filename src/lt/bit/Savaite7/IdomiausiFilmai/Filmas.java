package lt.bit.Savaite7.IdomiausiFilmai;

import java.time.LocalTime;

public class Filmas implements Comparable<Filmas> {
    private String pavadinimas;
    private int metai;
    private LocalTime trukme;
    private Integer ziurovuSkaiciusMln;
    
    public Filmas(String pavadinimas, int metai, LocalTime trukme, Integer ziurovuSkaiciusMln) {
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

    public Integer getZiurovuSkaiciusMln() {
        return ziurovuSkaiciusMln;
    }

    public void setZiurovuSkaiciusMln(Integer ziurovuSkaiciusMln) {
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

    // 1 - dabartinis filmas yra auksciau Filmas o
    // 0 - abu filmai pagal rikiavima lygus
    // -1 - dabartinis filmas yra zemiau Filmas o
    @Override
    public int compareTo(Filmas o) {
        // surikiuoti pagal trukme didejancia tvarka
        int res = trukme.compareTo(o.getTrukme());
        if(res > 0) {
            return 1;
        } else if(res < 0) {
            return -1;
        }
        // Jei lygu pagal ziurovuSkaiciusMln mazejancia tvarka
        res = ziurovuSkaiciusMln.compareTo(o.getZiurovuSkaiciusMln());
        if(res > 0) {
            return -1;
        } else if(res < 0) {
            return 1;
        }
        return 0;
    }
}
